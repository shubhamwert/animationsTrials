package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

import static java.lang.Boolean.TRUE;

public class NightLight extends AppCompatActivity {

    private Boolean b=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_light);



    }


    public void startStarS(View view) {
int t=0;

    int randomX = new Random().nextInt(1000);
    int randomY = new Random().nextInt(1000);

    Circle circle = new Circle(getBaseContext());
    circle.setAlpha(0);
    circle.DrawACircle((ImageView) findViewById(R.id.mImg), randomX, randomY, 11,25);
//        circle.animate().setDuration(12000).alpha(1);}


    }
}
