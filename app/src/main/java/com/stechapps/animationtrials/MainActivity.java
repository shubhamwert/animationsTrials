package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ColorAnimation(View view) {
        startActivity(new Intent(MainActivity.this,ColorAnimation.class));
    }
    public void Hinge(View view){
        startActivity(new Intent(MainActivity.this,HingeEffect.class));
    }

    public void Drag(View view) {
        startActivity(new Intent(MainActivity.this,Drag.class));

    }
}
