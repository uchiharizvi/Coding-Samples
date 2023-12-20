package com.java.sample.collectionsFW.interfaces.comparator.examples.e001;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Akshat","Apps"));
        employees.add(new Employee(11,"Akshat","Accounts"));
        employees.add(new Employee(91,"Akshat","HR"));
        employees.add(new Employee(221,"Ruksar","Apps"));
        employees.add(new Employee(1501,"Ruksar","Admin"));
        employees.add(new Employee(987,"Ruksar","IT"));

        System.out.println("unsorted ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

        Collections.sort(employees, new EmployeeSortingComparator());
        System.out.println("Sorted By Name or Dept ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

        Collections.sort(employees, new EmployeeSortingComparator());
        System.out.println("Sorted By Name or Dept ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

    }
}
