package com.westcliffarms.pocketadmin.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ListDocumentActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = new TextView(this);
        tv.setText("foo");
        setContentView(tv);
    }
}