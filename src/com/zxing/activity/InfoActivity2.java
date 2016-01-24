package com.zxing.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ericssonlabs.R;


public class InfoActivity2 extends Activity{

	private ImageView image;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info2);
		image = (ImageView) this.findViewById(R.id.iv_qr_image4);
	}
}
