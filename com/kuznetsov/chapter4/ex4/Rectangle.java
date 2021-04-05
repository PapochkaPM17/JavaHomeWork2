package com.kuznetsov.chapter4.ex4;

import com.kuznetsov.chapter2.ex5.Point;

public class Rectangle extends Shape implements Cloneable{
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
        moveBy(topLeft.getX() + width/2 , topLeft.getY() - height/2);
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Rectangle clone(){
        Point cloneTopLeft = new Point(topLeft.getX(), topLeft.getY());
        Rectangle clone = new Rectangle(cloneTopLeft, width,height);
        return clone;
    }
}
