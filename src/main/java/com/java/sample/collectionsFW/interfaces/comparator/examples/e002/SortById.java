package com.java.sample.collectionsFW.interfaces.comparator.examples.e002;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.employeeId - e2.employeeId;
    }
}
