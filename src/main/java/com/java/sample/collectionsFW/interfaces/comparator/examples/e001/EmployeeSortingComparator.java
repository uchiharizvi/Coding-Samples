package com.java.sample.collectionsFW.interfaces.comparator.examples.e001;

import java.util.Comparator;

public class EmployeeSortingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameCompare = e1.employeeName.compareTo(e2.employeeName);
        int deptCompare = e1.employeeDepartment.compareTo(e2.employeeDepartment);
        return (nameCompare == 0) ? deptCompare : nameCompare;
    }
}
