package com.java.sample.collectionsFW.interfaces.comparator.examples.e002;

public class Employee {
    public int employeeId;
    public String employeeName;
    public String employeeDepartment;

    public Employee(int employeeId, String employeeName, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return this.employeeId + " " + this.employeeName + " " + this.employeeDepartment;
    }
}
