package com.haurasalsabila.jipapet;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private  final int splashScreenTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ssIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ssIntent);
                finish();
            }
        },splashScreenTime);
    }
}
