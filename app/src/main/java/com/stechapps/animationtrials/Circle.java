package com.stechapps.animationtrials;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

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
    public void DrawACircle(ImageView view,int cx,int cy,int r){
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();

        Bitmap mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        view.setImageBitmap(mBitmap);
        Canvas canvas=new Canvas(mBitmap);
        canvas.drawCircle(cx,cy,r,paint);
    }
}
