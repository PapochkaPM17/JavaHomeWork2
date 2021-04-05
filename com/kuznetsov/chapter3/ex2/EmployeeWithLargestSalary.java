package com.kuznetsov.chapter3.ex2;

import com.kuznetsov.chapter3.ex1.Employee;
import com.kuznetsov.chapter3.ex1.Measurable;

public class EmployeeWithLargestSalary extends Employee {
    public EmployeeWithLargestSalary(int id, String firstName, String lastName, double avgSalary) {
        super(id, firstName, lastName, avgSalary);
    }

    public static Measurable largest(Measurable[] employees) {
        Measurable richestEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if(richestEmployee.getMeasure() < employees[i].getMeasure()) {
                richestEmployee = employees[i];
            }
        }
        return richestEmployee;
    }
}
