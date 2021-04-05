package com.kuznetsov.chapter4.ex4;

import com.kuznetsov.chapter2.ex5.Point;

public class Line extends Shape implements Cloneable{
    private Point from;
    private Point to;
    public Line(Point from, Point to) {
        this.from = from;
        this.to = to;
        moveBy(from.getX() + (to.getX() - from.getX())/2,  from.getY() + (to.getY() - from.getY())/2);
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Line clone() {
        Point fromClone = new Point(from.getX(), from.getY());
        Point toClone = new Point(to.getX(), to.getY());
        Line clone = new Line(fromClone, toClone);
        return clone;
    }
}
