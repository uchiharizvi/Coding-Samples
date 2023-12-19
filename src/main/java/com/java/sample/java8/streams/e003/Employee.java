package com.java.sample.java8.streams.e003;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private int age;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
