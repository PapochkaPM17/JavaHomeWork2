package com.kuznetsov.chapter4.ex4;

import com.kuznetsov.chapter2.ex5.Point;

public class Circle extends Shape implements Cloneable{
    private Point circleCenter;
    private double radius;

    public Circle(Point circleCenter, double radius) {
        this.circleCenter = circleCenter;
        this.radius = radius;
        moveBy(circleCenter.getX(), circleCenter.getY());
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Circle clone() {
        Point cloneCenter = new Point(circleCenter.getX(), circleCenter.getY());
        Circle clone = new Circle(cloneCenter, radius);
        return clone;
    }
}
