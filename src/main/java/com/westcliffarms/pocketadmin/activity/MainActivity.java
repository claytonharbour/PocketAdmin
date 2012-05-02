/*
 *  Copyright (C) 2012 Clayton Harbour (claytonharbour@gmail.com)
 */
package com.westcliffarms.pocketadmin.activity;

import com.westcliffarms.pocketadmin.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = new TextView(this);
        tv.setText("foo");
        setContentView(tv);
    }
}