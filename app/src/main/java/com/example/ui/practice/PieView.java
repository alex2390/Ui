package com.example.ui.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.Random;

/**
 * Des :
 * <p>
 * Date: 2020/8/4
 * Time: 16:05
 * author: renjiawen
 **/
public class PieView extends View {

    private String[] titles = {"kotlin", "java", "object-c", "go", "php"};
    private int[] percentages = {50, 90, 40, 90, 90};
    private int[] colors = {0xff000000, 0xffff0000, 0xffffff00, 0xffffff00, 0xffffffff};

    private Paint mPaint = null;


    public PieView(Context context) {
        super(context);
    }

    public PieView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PieView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PieView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        RectF rectF = new RectF(100, 100, 500, 500);
        for (int i = 0; i < percentages.length; i++) {
            mPaint.setColor(getRandomColor());
            canvas.drawArc(rectF, getStartAngle(i), percentages[i], true, mPaint);
        }

    }


    private int getStartAngle(int index) {
        int start = 0;
        for (int i = 0; i < index; i++) {
            start = start + percentages[i];

        }

        return start;

    }


    private int getRandomColor() {
        Random random = new Random();
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
        return ranColor;

    }

    private static final String TAG = "PieView";

    private int getPercent(int pers) {
        int sum = 0;
        for (int per : percentages) {
            sum = sum + per;

        }
        int color = 360 * ((pers * 100) / sum) / 100;
        Log.d(TAG, "getPercent: ");

        return color;

    }
}
