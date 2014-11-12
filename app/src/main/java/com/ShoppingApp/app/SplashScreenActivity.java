package com.ShoppingApp.app;

/**
 * Created by Eugene K on 11/11/2014.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity {
    private static int SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, LogInActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}

