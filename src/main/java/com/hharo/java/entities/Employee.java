package com.hharo.java.entities;

public class Employee {
    private int id;
    private String name;
    private float salaryPerHour;

    public Employee(int id, String name, float salaryPerHour) {
        this.id = id;
        this.name = name;
        this.salaryPerHour = salaryPerHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(float salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return String.format("Id: %d; Name: %s; Salary: %f", this.id, this.name, this.salaryPerHour);
    }
}
