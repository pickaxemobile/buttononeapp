package com.km.buttononeapp;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

	private static final String TAG = "buttononeapp";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void hasClicked(View v){
		Log.d("buttononeapp","I've been clicked!");
		
		MyButtonOne myApp = (MyButtonOne)getApplicationContext();	
		Log.d(TAG, "before inc. score: " + myApp.getScore());
		myApp.incrementScore();
		Log.d(TAG, "after inc. score: " + myApp.getScore());
		
		
		Intent mIntent = new Intent (getApplicationContext(), GuitarActivity.class);
		startActivity(mIntent);
		
	}

	

}
