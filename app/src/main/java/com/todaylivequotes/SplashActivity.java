package com.todaylivequotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = SplashActivity.this;

        int splash_Delayed = 3000;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent selectLanguageIntent = new Intent(mContext, SelectLanguageActivity.class);
                startActivity(selectLanguageIntent);
                finish();
            }
        }, splash_Delayed);
    }
}