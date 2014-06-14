package com.km.buttononeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GuitarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guitar);
		
		TextView scoreTV = (TextView) findViewById(R.id.score);

		MyButtonOne myApp = (MyButtonOne)getApplicationContext();	
		
		int currentScore = myApp.getScore();
		
		String currentScoreString = Integer.toString(currentScore);
		
		scoreTV.setText(currentScoreString);
	}
}
