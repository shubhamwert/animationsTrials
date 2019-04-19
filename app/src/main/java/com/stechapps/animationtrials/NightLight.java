package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class NightLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_light);
        findViewById(R.id.black_night_light).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int cx= (int) event.getX();

                int cy= (int) event.getY();

                int randomX=new Random().nextInt(cx);
                int randomY=new Random().nextInt(cy);

                Circle circle=new Circle(getBaseContext());
                circle.setAlpha(0);
                circle.DrawACircle((ImageView) findViewById(R.id.mImg),randomX,randomY,11);
//                circle.animate().setDuration(12000).alpha(1);

                return false;
            }
        });


    }
}
