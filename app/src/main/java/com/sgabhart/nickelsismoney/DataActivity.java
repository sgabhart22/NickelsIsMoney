package com.sgabhart.nickelsismoney;

/**
 * Created by Admin on 9/8/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class DataActivity extends AppCompatActivity {
    public static final String DA = "DataActivity";

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }

    public void goBack(View v){
        this.finish();
    }

    public void onStart(){
        super.onStart();
        Log.w(DA, "Inside onStart\n");
    }

    public void onResume(){
        super.onResume();
        Log.w(DA, "Inside onResume\n");
    }

    public void onRestart(){
        super.onRestart();
        Log.w(DA, "Inside onRestart\n");
    }

    public void onPause(){
        super.onPause();
        Log.w(DA, "Inside onPause\n");
    }

    public void onStop(){
        super.onStop();
        Log.w(DA, "Inside onStop\n");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.w(DA, "Inside onDestroy\n");
    }
}
