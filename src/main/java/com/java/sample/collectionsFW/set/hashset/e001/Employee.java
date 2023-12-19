package com.java.sample.collectionsFW.set.hashset.e001;

import java.util.Objects;

public class Employee {
    private String key;
    private  Integer value;

    public Employee(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(key, employee.key) &&
                Objects.equals(value, employee.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
