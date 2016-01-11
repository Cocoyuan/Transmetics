package com.zxing.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ericssonlabs.R;


public class InfoActivity extends Activity{

	private TextView resultTextView;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.information);
		resultTextView = (TextView) this.findViewById(R.id.tv_scan_result);
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		//澶勭悊鎵弿缁撴灉锛堝湪鐣岄潰涓婃樉绀猴級
		if (resultCode == RESULT_OK) {
			Bundle bundle = data.getExtras();
			String scanResult = bundle.getString("result");
			resultTextView.setText(scanResult);
			
		}
	}
}
