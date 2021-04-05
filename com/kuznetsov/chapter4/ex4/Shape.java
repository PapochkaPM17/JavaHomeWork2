package com.kuznetsov.chapter4.ex4;

import com.kuznetsov.chapter2.ex5.Point;

public abstract class Shape {
    protected Point center;

    public Shape() {
        center = new Point();
    }

    public void moveBy(double dx, double dy) {
        center = center.translate(dx, dy);
    }

    public abstract Point getCenter();
}
