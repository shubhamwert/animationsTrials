package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HingeEffect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinge_effect);
        Toast.makeText(this, "Tap On screen", Toast.LENGTH_SHORT).show();
    }

    public void hinge(View view) {
        final ImageView img=findViewById(R.id.hingeIt);
        img.setPivotX(0f);
        img.setPivotY(0f);

        img.animate().rotationBy(45f).setDuration(5000).setInterpolator(new BounceInterpolator()).withStartAction(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(HingeEffect.this, "Screen rotated and scaled", Toast.LENGTH_SHORT).show();
            }
        }).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            img.animate().translationYBy(1000f).setInterpolator(new AccelerateInterpolator()).setDuration(1200L).withEndAction(new Runnable() {
                @Override
                public void run() {
                    RelativeLayout rr=findViewById(R.id.rr_layout);
                    rr.removeView(img);
                }
            }).start();

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).start();
    }
}
