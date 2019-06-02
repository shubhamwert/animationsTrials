package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SliceTheWordActivity extends AppCompatActivity {
SliceWordTextView tw;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slice_the_word);
        tw = (SliceWordTextView) findViewById(R.id.mSlicerView);
    tw.setText("Hello");


}

    public void SliceIt(View view) {
tw.setCharacterDelay(50);
        ImageView SlicerSvg=findViewById(R.id.si_img);
        SlicerSvg.setY(tw.getY());
        SlicerSvg.animate().alpha(1).translationYBy(tw.getY()+tw.getHeight()-1).setDuration(500).withEndAction(new Runnable() {
            @Override
            public void run() {
                tw.setText("Hello");

                tw.SliceIt("Hello");

            }
        }).setInterpolator(new AccelerateInterpolator()).start();


    }
}
