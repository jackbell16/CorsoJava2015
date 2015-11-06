package com.campus.calcolatriceandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import operazioni.Operazione;
import operazioni.OperazioniDisponibili;

public class MainActivity extends Activity {
	
	private EditText inputA;
	private EditText inputB;
	private Spinner spinner;
	private Button button;
	private TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inputA = (EditText) findViewById(R.id.editText1);
		inputB = (EditText) findViewById(R.id.editText2);
		spinner = (Spinner) findViewById(R.id.spinner1);
		button = (Button) findViewById(R.id.button1);
		result = (TextView) findViewById(R.id.textView2);
		loadOperations();
		action();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void loadOperations(){
		ArrayAdapter<Operazione> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, OperazioniDisponibili.disponibili.getOperazioni());
		spinner.setAdapter(adapter);
	}
	
	private void action(){
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Operazione operazione = (Operazione)(spinner.getSelectedItem());
				int a = Integer.valueOf(inputA.getText().toString());
				int b = Integer.valueOf(inputB.getText().toString());
				operazione.calcola(a, b);
				result.setText(operazione.mostraRisultato());
			}
		});
	}
}
