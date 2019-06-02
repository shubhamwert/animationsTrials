package com.stechapps.animationtrials;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.text.CollationElementIterator;

public class SliceWordTextView extends TextView {


    private CharSequence mText;
    private int mIndex;
    private long mDelay = 225;

    private Handler mHandler = new Handler();
    private Runnable SeprateIt=new Runnable() {
        @Override
        public void run() {
            mText=String.format("%s %s", mText.subSequence(0, mIndex / 2), mText.subSequence(mIndex / 2 , mText.length()));
            setText(mText);
            mIndex=mText.length();
            if (mIndex <20) {
                mHandler.postDelayed(SeprateIt, mDelay++);

            }
        }
    };
    private Canvas mCanvas;

    public SliceWordTextView(Context context) {
        super(context);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mCanvas=canvas;
    }

    public SliceWordTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SliceWordTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SliceWordTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    public void SliceIt(CharSequence txt) {
        mText = txt;
        mIndex = txt.length();
        setText("");
        mHandler.removeCallbacks(SeprateIt);
        mHandler.postDelayed(SeprateIt, mDelay);

        Log.d("Slice IT", "SliceIt: "+mCanvas);

    }
    public void setCharacterDelay(long m) {
        mDelay = m;
    }



}
