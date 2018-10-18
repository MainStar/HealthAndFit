package com.example.mainstar.health;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * Created by mainstar on 18.10.18.
 */

public class AuthorizationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.authorization_activity);
    }
}
