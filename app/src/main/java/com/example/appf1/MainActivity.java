package com.example.appf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DC", "Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DC", "Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DC", "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DC", "Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DC", "Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DC", "stop");

    }
}
