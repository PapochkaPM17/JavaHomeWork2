package com.kuznetsov.chapter1.ex2;

public class AngleNormalize {
    public static int normalize(int angle) {
        while(angle < 0) {
            angle += 360;
        }
        return angle%360;
    }

    public static int normalizeFloorMod(int angle ) {
        return Math.floorMod(angle, 360);
    }
}