package com.kuznetsov.chapter3.ex1;

public class Employee implements Measurable{
    private int id;
    private String firstName;
    private String lastName;
    private double avgSalary;

    public Employee(int id, String firstName, String lastName, double avgSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avgSalary = avgSalary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return avgSalary * 12;
    }

    public void setSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public void raiseSalary(int percent) {
        avgSalary = avgSalary*(1 + percent/100.0);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + avgSalary +
                '}';
    }

    @Override
    public double getMeasure() {
        return avgSalary;
    }

    public static double average(Measurable[] employees) {
        double averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getMeasure();
        }
        return averageSalary/employees.length;
    }
}
