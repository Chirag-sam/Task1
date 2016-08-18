package com.example.chirag.task1;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class FirstActivity extends AppCompatActivity {
    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            Intent i = new Intent(FirstActivity.this,mainactivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Runnable r = new Runnable() {
            @Override
            public void run()
            {
                long futuretime = System.currentTimeMillis() + 3000;
                while(System.currentTimeMillis() < futuretime)
                {
                    synchronized (this)
                    {
                        try
                        {
                           wait(futuretime - System.currentTimeMillis());
                        }
                        catch (Exception e){}
                    }
                };
               h.sendEmptyMessage(0);
            }
        };
        Thread awesome = new Thread(r);
        awesome.start();

    }

}
