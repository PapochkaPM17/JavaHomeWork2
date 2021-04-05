package com.kuznetsov.chapter1.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryTicket {
    ArrayList<Byte> numbers;
    byte[] ticket;

    public LotteryTicket() {
        numbers = new ArrayList<Byte>();
        ticket = new byte[6];
        for(byte i = 1; i <= 49; i++) {
            numbers.add(i);
        }
    }

    public void buyTicket() {
        for(byte i = 1; i <= 6; i++) {
            byte value = (byte)ThreadLocalRandom.current().nextInt(0, numbers.size());
            ticket[i - 1] = numbers.get(value);
            numbers.remove(value);
        }
        Arrays.sort(ticket);
    }

    public void print() {
        System.out.println(Arrays.toString(ticket));
    }
}
