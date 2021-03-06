package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import com.stechapps.animationtrials.Utills.MyDragListener;

public class Drag extends AppCompatActivity implements View.OnDragListener {
String TAG="MAin ACtivity";

    private android.widget.RelativeLayout.LayoutParams layoutParams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag);
        findViewById(R.id.img1).setOnTouchListener(new MyDragListener());
        findViewById(R.id.img1).setOnDragListener(this);
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        RelativeLayout rr=findViewById(R.id.rr_lay);

        int x_cord,y_cord;

        switch (event.getAction()){

            case DragEvent.ACTION_DRAG_STARTED:
                Log.d(TAG, "onDrag: Started");
                rr.removeViewAt(0);
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d(TAG, "onDrag: Entered");
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                Log.d(TAG, "onDrag: Exited");


                break;
            case DragEvent.ACTION_DRAG_ENDED:

                x_cord = (int) event.getX();
                y_cord = (int) event.getY();
                Log.d(TAG, "onDrag: Ended  "+x_cord+  " ");
                rr.addView(v,0);




                break;
            case DragEvent.ACTION_DROP:                Log.d(TAG, "onDrag: Drop");

                break;



        }
        return false;
    }

}
