package com.km.buttononeapp;

import android.app.Application;
import android.util.Log;

public class MyButtonOne extends Application {
	private static final String TAG = "buttononeapp";
	public int score;
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.d(TAG,"in oncreate");
		score = 0;
	}
	
	
	public void incrementScore(){
		score ++;
	}
	
	public int getScore(){
		return score;
	}

}
