package com.kuznetsov.chapter1.ex3;

public class PrintMaxOfThree {
    public static void print(int first, int second, int third) {
        int max = first >= second ? first : second;
        max = max >= third ? max : third;
        System.out.println(max);
    }

    public static void printUsingMath(int first, int second, int third) {
        int max = Math.max(first, second);
        max = Math.max(max, third);
        System.out.println(max);
    }
}
