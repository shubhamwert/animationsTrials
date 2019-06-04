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

    public void Night(View view) {
        startActivity(new Intent(MainActivity.this,NightLight.class));

    }

    public void stager(View view) {
        startActivity(new Intent(MainActivity.this,StagerLayoutTest.class));

    }

    public void TypeWriter(View view) {
        startActivity(new Intent(MainActivity.this,TypeWriter.class));

    }

    public void RippleView(View view){
        startActivity(new Intent(MainActivity.this,RippleView.class));

    }


    public void parralx_1(View view) {
        startActivity(new Intent(MainActivity.this,ParralxUsingLibrary.class));
    }
    public void Slicer(View view) {
        startActivity(new Intent(MainActivity.this,SliceTheWordActivity.class));
    }
    public void Sample(View view) {
        startActivity(new Intent(MainActivity.this,samplePhysics.class));
    }
}
