package com.ericssonlabs;

import com.google.zxing.WriterException;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.zxing.activity.CaptureActivity;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BarCodeTestActivity extends Activity {
    /** Called when the activity is first created. */
	//private TextView resultTextView;
	private EditText qrStrEditText;
	private ImageView qrImgImageView;
	private ImageButton bt_home, bt_user, bt_search, bt_set, bt_scan;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bt_home = (ImageButton) this.findViewById(R.id.btn_home);
        bt_user = (ImageButton) findViewById(R.id.btn_user);
        bt_search = (ImageButton) findViewById(R.id.btn_search);
        bt_set = (ImageButton) findViewById(R.id.btn_set);
        bt_scan = (ImageButton) this.findViewById(R.id.btn_scan);
        bt_scan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//鎵撳紑鎵弿鐣岄潰鎵弿鏉″舰鐮佹垨浜岀淮鐮�				
				Intent openCameraIntent = new Intent(BarCodeTestActivity.this,CaptureActivity.class);
				startActivityForResult(openCameraIntent, 0);
			}
		});
        
    //    Button generateQRCodeButton = (Button) this.findViewById(R.id.btn_add_qrcode);
    /*   generateQRCodeButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					String contentString = qrStrEditText.getText().toString();
					if (!contentString.equals("")) {
						//鏍规嵁瀛楃涓茬敓鎴愪簩缁寸爜鍥剧墖骞舵樉绀哄湪鐣岄潰涓婏紝绗簩涓弬鏁颁负鍥剧墖鐨勫ぇ灏忥紙350*350锛�						
						Bitmap qrCodeBitmap = EncodingHandler.createQRCode(contentString, 350);
						qrImgImageView.setImageBitmap(qrCodeBitmap);
					}else {
						Toast.makeText(BarCodeTestActivity.this, "Text can not be empty", Toast.LENGTH_SHORT).show();
					}
					
				} catch (WriterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
       */
    }

//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		super.onActivityResult(requestCode, resultCode, data);
//		//澶勭悊鎵弿缁撴灉锛堝湪鐣岄潰涓婃樉绀猴級
//		if (resultCode == RESULT_OK) {
//			Bundle bundle = data.getExtras();
//			String scanResult = bundle.getString("result");
//			//resultTextView.setText(scanResult);
//			
//		}
//	}

}