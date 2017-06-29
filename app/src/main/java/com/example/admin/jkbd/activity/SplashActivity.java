package com.example.admin.jkbd.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.jkbd.R;

/**
 * Created by admin on 2017/6/29.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shan);
        afs.start();
    }
    CountDownTimer afs=new CountDownTimer(2000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            SplashActivity.this.finish();

        }
    };

}
