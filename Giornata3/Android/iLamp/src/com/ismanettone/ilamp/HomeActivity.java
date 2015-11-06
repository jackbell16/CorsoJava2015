package com.ismanettone.ilamp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HomeActivity extends Activity {
	
	private SharedPreferences prefs;
	private ImageButton buttonOn;
	private ImageButton buttonOff;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		prefs = getApplicationContext().getSharedPreferences(
				"introduzione", Context.MODE_PRIVATE);
		buttonOn = (ImageButton) findViewById(R.id.imageButtonON);
		buttonOff = (ImageButton) findViewById(R.id.imageButtonOFF);
		actionButton(buttonOn, "on");
		actionButton(buttonOff, "off");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			prefs.edit().putBoolean("intro", true).apply();;
			Intent i = new Intent(this,
					new MainActivity().getClass());
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void actionButton(ImageButton button, final String command){
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String ip = prefs.getString("ip", "");
				ComunicationTask task = new ComunicationTask(HomeActivity.this);
				task.execute(ip,command);
			}
		});
	}
}
