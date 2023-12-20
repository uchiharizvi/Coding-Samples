package com.java.sample.java8.streams.examples.e007;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Compute sum of salaries of employee
 **/
public class Collectors003 {
    public static void main(String[] args) {
        Employee employee = new Employee(001, "Prakash", 25000);
        Employee employee2 = new Employee(002, "Raj", 30000);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        int total = employees.stream().
                collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(total);
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

