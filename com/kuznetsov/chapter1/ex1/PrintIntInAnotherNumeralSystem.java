package com.kuznetsov.chapter1.ex1;

public class PrintIntInAnotherNumeralSystem {
    public static void printBinary(int number) {
        String binary =  Integer.toBinaryString(number);
        System.out.println(binary);
    }

    public static void printOctal(int number) {
        String octal =  Integer.toOctalString(number);
        System.out.println(octal);
    }

    public static void printHex(int number) {
        String hex =  Integer.toHexString(number);
        System.out.println(hex);
    }

}