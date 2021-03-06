package com.example.viraljoshi.stepin2it.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.viraljoshi.stepin2it.R;
import com.example.viraljoshi.stepin2it.SharedPreferenceConfig;

public class SplashScreenActivity extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (SharedPreferenceConfig.getInstance(SplashScreenActivity.this).readLoginStatus()) {
                    startActivity(new Intent(SplashScreenActivity.this, DashboardActivity.class));
                } else {
                    Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(i);
                }
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
