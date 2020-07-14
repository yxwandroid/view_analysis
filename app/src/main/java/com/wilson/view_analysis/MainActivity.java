package com.wilson.view_analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("MainActivity", "dispatchtouchEvent");

//        return true;
//        return  false;
        return super.dispatchTouchEvent(ev);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d("MainActivity", "onTouchEvent");
        return super.onTouchEvent(event);
    }
}