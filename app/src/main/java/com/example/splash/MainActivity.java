package com.example.splash;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.WindowManager;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setBackgroundColor(Color.YELLOW);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity
        //can cover the entire screen.

        setContentView(R.layout.activity_main);
        //this will bind your MainActivity.class file with activity_main.
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,
                        SecondActivity.class);
                //Intent is used to switch from one activity to another.
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
                //invoke the SecondActivity.
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }
}
