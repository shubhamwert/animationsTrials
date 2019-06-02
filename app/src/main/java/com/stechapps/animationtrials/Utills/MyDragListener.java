package com.stechapps.animationtrials.Utills;

import android.content.ClipData;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

public class MyDragListener implements View.OnTouchListener {

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            ClipData data = ClipData.newPlainText(" ", " ");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                    view);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                view.startDragAndDrop(data, shadowBuilder, view, 0);
            }
            else                 view.startDrag(data, shadowBuilder, view, 0);


            return true;
        } else {
            return false;
        }
    }
}
