package com.example.chirag.task1;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import android.os.Handler;

public class secondactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle datadata=getIntent().getExtras();
            String data = datadata.getString("data");

            Toast.makeText(secondactivity.this, "Hello "+data, Toast.LENGTH_LONG).show();


        }
        return super.onKeyDown(keyCode, event);
    }
}
