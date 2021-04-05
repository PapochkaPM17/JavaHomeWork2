package com.kuznetsov.chapter1.ex6;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger fn(long number) {
        BigInteger result = BigInteger.valueOf(1);
        if (number == 0 || number == 1) {
            return result;
        }
        result = fn(number - 1).multiply(BigInteger.valueOf(number));
        return result;
    }
}
