package com.stechapps.animationtrials;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class LineDraw extends View {
    Paint paint = new Paint();
    private Paint mPaint = new Paint();


    private void init() {
        paint.setColor(Color.BLACK);

    }
    public LineDraw(Context context) {
        super(context);
    }

    public LineDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LineDraw(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LineDraw(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {


        super.onDraw(canvas);
    }

    public void DrawALine(ImageView view, int startX, int startY, int EndX, int Endy ){
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();

        Bitmap mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        view.setImageBitmap(mBitmap);
        Canvas canvas=new Canvas(mBitmap);
        canvas.drawColor(Color.WHITE);
//        Rect mFrame = new Rect(startX, startY, EndX, Endy);
paint.setStrokeCap(Paint.Cap.SQUARE);
paint.setStrokeWidth(12f);
        canvas.drawLine(EndX, Endy, startX, startY,paint);


        view.invalidate();
    }
}
