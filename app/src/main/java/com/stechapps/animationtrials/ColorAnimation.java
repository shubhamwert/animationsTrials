package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.drm.DrmStore;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class ColorAnimation extends AppCompatActivity {
    LineDraw myCanvasView;

    private static final String DEBUG_TAG = "Aniamtion action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_animation);
        myCanvasView = new LineDraw(this);
        RelativeLayout rr=findViewById(R.id.rr);
        Log.d("CAnvas Point", "onCreate: CAnvas Added");
        rr.addView(myCanvasView);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x=event.getX()*event.getXPrecision();
        float y=event.getY()*event.getYPrecision();

        ImageView img=findViewById(R.id.imgView);
        TextView mtext=findViewById(R.id.boxBlue);
        float x1=mtext.getX();
        float y1=mtext.getX();

        mtext.animate().setDuration(1000).translationX(x).translationY(y).start();
       float random=new Random().nextInt(1000);
        float random2=new Random().nextInt(1000);
        findViewById(R.id.redBlue).animate().setDuration(1000).translationX(random).translationY(random2).start();
myCanvasView.DrawALine(img,(int)x1,(int)y1,(int)x,(int)y);

        return super.onTouchEvent(event);
    }






}
