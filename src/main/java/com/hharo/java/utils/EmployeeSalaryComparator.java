package com.hharo.java.utils;

import com.hharo.java.entities.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
       return Float.compare(o1.getSalaryPerHour(), o2.getSalaryPerHour());
    }
}
