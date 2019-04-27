package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StagerLayoutTest extends AppCompatActivity {
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stager_layout_test);

        l = (LinearLayout)findViewById(R.id.ll);
        LayoutTransition transition = new LayoutTransition();
        ObjectAnimator a1 = ObjectAnimator.ofFloat(null, View.SCALE_X, 0, 1);
        ObjectAnimator a2 = ObjectAnimator.ofFloat(null, View.SCALE_Y, 0, 1);
        ObjectAnimator a3 = ObjectAnimator.ofFloat(null, View.ALPHA, 0, 1);
        AnimatorSet animator=  new AnimatorSet();

        animator.playTogether(a1, a2, a3);





        transition.setAnimator(LayoutTransition.APPEARING, animator);
        transition.setStagger(LayoutTransition.CHANGE_APPEARING, 1000);
        transition.setStagger(LayoutTransition.CHANGE_DISAPPEARING, 1000);
        transition.setStagger(LayoutTransition.APPEARING, 1000);
        transition.setStagger(LayoutTransition.DISAPPEARING, 1000);

        transition.setDuration(2000);


        l.setLayoutTransition(transition);




    }


    public void reveal(View view) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100);
        for(int i=0; i<5; i++){
            TextView t = new TextView(this);
            t.setBackgroundColor(Color.GRAY);
            t.setText(String.format("Hello %d", i));


            t.setLayoutParams(params);
            l.addView(t);
        }
    }
}

