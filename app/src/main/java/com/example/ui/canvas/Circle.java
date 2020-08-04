package com.example.ui.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.example.ui.R;

import static android.graphics.Path.Direction.CCW;
import static android.graphics.Path.Direction.CW;

/**
 * Des :
 * <p>
 * Date: 2020/7/23
 * Time: 16:28
 * author: renjiawen
 **/
public class Circle extends View {

    Paint paint = new Paint();

    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(getResources().getColor(R.color.colorAccent));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        Path path = new Path();

        path.lineTo(100, 100);
        path.arcTo(100, 100, 300, 300, -90, 90, false);



        canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成

    }


}
