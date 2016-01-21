package com.zxing.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ericssonlabs.R;


public class InfoActivity1 extends Activity{

	private ImageView image;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info1);
		image = (ImageView) this.findViewById(R.id.iv_qr_image3);
	}
	
}
