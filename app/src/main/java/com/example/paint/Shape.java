package com.example.paint;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;
    protected boolean fill;
    protected boolean thickness;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    public void setThikness(boolean thikness) {
        this.thickness = thikness;
    }

    public abstract void updatePoint(int xe, int ye);

    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.parseColor(color));
        if (fill)
            paint.setStyle(Paint.Style.FILL);
        else
            paint.setStyle(Paint.Style.STROKE);
        if(thickness)
            paint.setStrokeWidth(50);
        else
            paint.setStrokeWidth(15);
    }

}