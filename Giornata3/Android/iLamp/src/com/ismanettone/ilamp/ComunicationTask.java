package com.ismanettone.ilamp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Background Async Task to Create new product
 */
public class ComunicationTask extends AsyncTask<String, Void, String> {

	private ProgressDialog pDialog;

	private Context context;

	public ComunicationTask(Context context) {
		super();
		this.context = context;

	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		pDialog = new ProgressDialog(context);
		pDialog.setMessage("Caricamento...");
		pDialog.setIndeterminate(false);
		pDialog.setCancelable(true);
		pDialog.show();

	}

	@Override
	protected String doInBackground(String... params) {
		if(Connection.getConnection().isNetworkAvailable(context)){
		String ip = params[0];
		String command = params[1];
		return Connection.getConnection().sendCommand(ip, command);
		}else{
			return "Verifica di essere connesso and Internet";
		}

	}

	@Override
	protected void onPostExecute(String result) {
		pDialog.dismiss();
		Toast.makeText(context, result, Toast.LENGTH_LONG).show();
		super.onPostExecute(result);

	}

}