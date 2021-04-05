package com.kuznetsov.chapter2.ex9;

public class Car {
    private final double efficiency;
    private final double capacity;
    private double x = 0;
    private double fuelLevel = 0;

    public Car(double efficiency, double capacity) {
        this.efficiency = efficiency;
        this.capacity = capacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getX() {
        return x;
    }

    public double getCurrentCapacity() {
        return capacity - fuelLevel;
    }

    public void reFuel(double gallons) {
        if(gallons < 0 || gallons > capacity - fuelLevel) {
            System.out.println("Enter correct value!");
        } else {
            System.out.println("You refuel " + gallons + " gallons");
            fuelLevel += gallons;
        }
    }

    public void drive(double miles) {
        if(miles >= 0) {
            x += miles;
            if(miles <= fuelLevel * efficiency) {
                System.out.println("You drive " + miles + " miles");
            } else {
                System.out.println("You drive " + fuelLevel * efficiency + " miles");
                System.out.println("You need " + (miles - fuelLevel * efficiency) / efficiency + " gallons of fuel more to drive all the way");
            }
            fuelLevel -= miles/efficiency;
        } else {
            System.out.println("Enter correct value");
        }
    }
}
