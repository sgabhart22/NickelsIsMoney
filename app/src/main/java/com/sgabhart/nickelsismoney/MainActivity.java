package com.sgabhart.nickelsismoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String MA = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void modifyData(View v){
        Intent myIntent = new Intent(this, DataActivity.class);
        this.startActivity(myIntent);
    }

    public void onStart(){
        super.onStart();
        Log.w(MA, "Inside onStart\n");
    }

    public void onResume(){
        super.onResume();
        Log.w(MA, "Inside onResume\n");
    }

    public void onRestart(){
        super.onRestart();
        Log.w(MA, "Inside onRestart\n");
    }

    public void onPause(){
        super.onPause();
        Log.w(MA, "Inside onPause\n");
    }

    public void onStop(){
        super.onStop();
        Log.w(MA, "Inside onStop\n");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.w(MA, "Inside onDestroy\n");
    }
}
