package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint mTextPaint;
    private Paint mCirclePaint;
    private final String[] labels = {"Lollipop", "Marshmallow", "Froyo", "Gingerbread", "Ice Cream Sandwitch", "Jelly Bean", "KitKat"};
    private final float[] ratios = {0.34f, 0.14f, 0.02f, 0.02f, 0.17f, 0.33f};
    private final int[] colors = {0xffF6412C,0xffFFC200,0xff9D1BB2,0xff9D9E9D,0xff009688,0xff009688};


    public Practice11PieChartView(Context context) {
        this(context, null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.WHITE);

        mCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCirclePaint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
