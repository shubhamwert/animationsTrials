package com.stechapps.animationtrials;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.Random;

public class Circle extends View {
    private Paint paint;
    public Circle(Context context) {
        super(context);
        paint=new Paint();
        paint.setColor(Color.WHITE);

    }

    public Circle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    public void DrawACircle(final ImageView view, final int cx, final int cy, final int r,int n){
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        view.setAlpha(0f);
        Bitmap mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        view.setImageBitmap(mBitmap);
        Canvas canvas=new Canvas(mBitmap);
        canvas.drawCircle(cx,cy,r,paint);
        n--;
        final int k=n-1;

        view.animate().setDuration(900).alpha(1).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() {
            @Override
            public void run() {
               view.animate().setDuration(1000).setInterpolator(new AnticipateInterpolator()).alpha(0f);
               if(k>0) {
                   DrawACircle(view, new Random().nextInt(1000), new Random().nextInt(1000), r, k);

               }
            }
        }).start();
        invalidate();
    }
}
