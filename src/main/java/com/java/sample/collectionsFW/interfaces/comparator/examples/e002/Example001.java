package com.java.sample.collectionsFW.interfaces.comparator.examples.e002;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example001 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Akshat","Apps"));
        employees.add(new Employee(11,"Bakhtawar","Accounts"));
        employees.add(new Employee(91,"Rakesh","HR"));
        employees.add(new Employee(221,"Aamir","Apps"));
        employees.add(new Employee(1501,"Ruksar","Admin"));
        employees.add(new Employee(987,"Joshua","IT"));

        System.out.println("unsorted ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

        Collections.sort(employees, new SortById());
        System.out.println("Sorted By Id ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

        Collections.sort(employees, new SortByName());
        System.out.println("Sorted By Name ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

        Collections.sort(employees, new SortByDepartment());
        System.out.println("Sorted By Department ");
        System.out.println("--------------------");
        employees.forEach(System.out::println);

    }
}
