package com.example.mainstar.health;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }

    public void excitingAccount(View v){
        TextView excitingAccountLink = findViewById(R.id.linkHaveAccount);
        excitingAccountLink.setTextColor(Color.parseColor("#191970"));

        AuthorizationActivity authorizationActivity = new AuthorizationActivity();
        Intent authorizationActivityIntent = new Intent(this, authorizationActivity.getClass());
        authorizationActivityIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(authorizationActivityIntent);
    }
}
