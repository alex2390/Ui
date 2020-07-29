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
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();


        RectF rectOne = new RectF(200, 200, 400, 400);
        RectF rectTwo = new RectF(400, 200, 600, 400);
        path.addArc(rectOne,180,180);
        path.arcTo(rectTwo,180,180,false);
//        path.lineTo(400,550);

        canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成

    }


}
