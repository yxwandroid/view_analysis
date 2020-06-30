package com.wilson.view_analysis;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class MyLineLayout extends LinearLayout {
    public MyLineLayout(Context context) {
        super(context);
    }

    public MyLineLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLineLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyLineLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    int mLastX ;
    int mLastY;
    int mLastXIntercept;
    int mLastYIntercept;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("MyLineLayout", "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
//        setBackgroundColor(Color.RED);
//        return  true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("MyLineLayout", "onInterceptTouchEvent");
        boolean intercepted = false;
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN: {
                intercepted =false;
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                int deltaX = x- mLastXIntercept;
                int deltaY = y-mLastYIntercept;;
                if (Math.abs(deltaX)>Math.abs(deltaY)){
                    intercepted =true;
                }else{
                    intercepted=false;
                }
            }
            break;
            case MotionEvent.ACTION_UP:{
                intercepted =false;
            }
            break;
        }
        mLastX = x;
        mLastY =y;
        mLastXIntercept =x;
        mLastYIntercept =y;
        return  intercepted;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MyLineLayout", "onTouchEvent");
        setBackgroundColor(Color.BLUE);
        return super.onTouchEvent(event);
    }
}
