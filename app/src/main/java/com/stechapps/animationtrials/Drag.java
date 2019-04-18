package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class Drag extends AppCompatActivity implements View.OnDragListener {
String TAG="MAin ACtivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);
        findViewById(R.id.img1).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.img1).setOnDragListener(this);
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()){

            case DragEvent.ACTION_DRAG_STARTED:
                Log.d(TAG, "onDrag: Started");
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d(TAG, "onDrag: Entered");
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                Log.d(TAG, "onDrag: Exited");

                break;
            case DragEvent.ACTION_DRAG_ENDED:
                v.setX(event.getX());
                v.setY(event.getY());
                Log.d(TAG, "onDrag: Ended");

                break;
            case DragEvent.ACTION_DROP:                Log.d(TAG, "onDrag: Drop");

                break;



        }
        return false;
    }
    private final class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                        view);
                view.startDrag(data, shadowBuilder, view, 0);
                return true;
            } else {
                return false;
            }
        }
    }

}
