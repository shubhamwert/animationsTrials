package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class OnDragShow extends AppCompatActivity implements View.OnDragListener {
    FrameLayout fm;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_drag_show);
        fm=findViewById(R.id.revealText);
        textView = findViewById(R.id.textreveal);


    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        String TAG = "ON Drag show";
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
                Log.d(TAG, "onDrag: Ended"+event.getX());

                break;
            case DragEvent.ACTION_DROP:                Log.d(TAG, "onDrag: Drop");

                break;



        }
        return false;
    }
}
