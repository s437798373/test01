package com.example.excep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	TextView tv;
	Button bt,bt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyApplication.getInstance().addActivity(this);
		bt.setOnClickListener(this);
		bt2.setOnClickListener(this);
		System.out.println("fdsafd");
	}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bt:
			System.out.println("hahaha");
			break;
		}
	}
}
