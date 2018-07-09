package com.whb.imagebuttontest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ImageButtonActivity extends Activity {
	private ImageButton mWifiButton = null;
	private ImageButton mGpsButton = null;
	private ImageButton mFlightModeButton = null;
	private ImageButton mBTButton = null;
	private ImageButtonOnClickListener listener = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_button);
		
		listener = new ImageButtonOnClickListener();
		
		mWifiButton = (ImageButton)findViewById(R.id.wifi);
		mGpsButton = (ImageButton)findViewById(R.id.gps);
		mFlightModeButton = (ImageButton)findViewById(R.id.flightmode);
		mBTButton = (ImageButton)findViewById(R.id.bluetooth);
		
		mWifiButton.setOnClickListener(listener);
		mWifiButton.setOnLongClickListener(listener);
		
		mGpsButton.setOnClickListener(listener);
		mGpsButton.setOnLongClickListener(listener);
		
		mFlightModeButton.setOnClickListener(listener);
		mFlightModeButton.setOnLongClickListener(listener);
		
		mBTButton.setOnClickListener(listener);
		mBTButton.setOnLongClickListener(listener);
		
	}
	
	void enableDisableBT(){
		TelephonyManager t = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		
	}
	
	private class ImageButtonOnClickListener implements View.OnClickListener, View.OnLongClickListener {

		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stub
			if(v != null) {
				switch(v.getId()){
				case R.id.bluetooth:
					enableDisableBT();
					break;
					
				case R.id.flightmode:
					enableDisableFlightMode();
					break;
					
				case R.id.gps:
					enableDisableGps();
					break;
					
				case R.id.wifi:
					enableDisableWifi();
					break;
				
				default:
					break;
				}
			}
			
			return false;
		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(v != null) {
				switch(v.getId()){
				case R.id.bluetooth:
					enableDisableBT();
					break;
					
				case R.id.flightmode:
					enableDisableFlightMode();
					break;
					
				case R.id.gps:
					enableDisableGps();
					break;
					
				case R.id.wifi:
					enableDisableWifi();
					break;
				
				default:
					break;
				}
			}
		}
	}
	
	void enableDisableFlightMode(){
			
	}
	
	void enableDisableGps(){
		
	}
	
	void enableDisableWifi(){
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_image_button, menu);
		return true;
	}

}
