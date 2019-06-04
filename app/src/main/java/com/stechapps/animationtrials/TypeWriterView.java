package com.stechapps.animationtrials;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TypeWriterView extends TextView {
    private CharSequence mText;
    private int mIndex;
    private long mDelay = 150; // in ms
    private boolean b=false;
    private Handler mHandler = new Handler();
    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0, mIndex++));
            if (mIndex <= mText.length()) {
                mHandler.postDelayed(characterAdder, mDelay);
            }else {
                mHandler.postDelayed(characterdelete,mDelay+5000);
            }

        }
    };
    private Runnable characterdelete=new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0,mIndex--));
            if (mIndex>=0){
                mHandler.postDelayed(characterdelete,mDelay);
            }
        }
    };
    public TypeWriterView(Context context) {
        super(context);
    }

    public TypeWriterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TypeWriterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TypeWriterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void WriteText(CharSequence txt) {
        if (b) mText = txt;
        mIndex = 0;
        setText("");
        mHandler.removeCallbacks(characterAdder);
        mHandler.postDelayed(characterAdder, mDelay);

    }
    public void setCharacterDelay(long m) {
        mDelay = m;
    }
}