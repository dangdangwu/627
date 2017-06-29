package com.example.admin.jkbd.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.jkbd.R;

/**
 * Created by admin on 2017/6/29.
 */

public class rand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check.start();
    }
    CountDownTimer check=new CountDownTimer(1000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            startActivity(new Intent(rand.this,MainActivity.class));
            rand.this.finish();

        }
    };
}
