package com.example.excep;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
	Button bt,bt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyApplication.getInstance().addActivity(this);
		bt = (Button) findViewById(R.id.bt);
		bt2 = (Button) findViewById(R.id.bt2);
		System.out.println("fdsafd");
	}
}
