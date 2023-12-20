package com.java.sample.java8.streams.examples.e012;


import com.java.sample.utils.StringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int counter = 0;
        while (counter <= 10) {
            list.add(StringGenerator.generateStringPlain());
            counter++;
        }
        Employee emp = new Employee(1L, "Ramesh", "Acc");
        Employee emp2 = new Employee(2L, "Kamesh", "Apps");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp2);

        //use streams on arrayList
        //filter -- intermediate operation | collect --terminal
        List<String> list2 = list.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
        System.out.println(list2);

        //Map Operation with Lambda
        List<String> deptList = employeeList.stream().map(x -> x.getDeptName()).collect(Collectors.toList());

        //Map Operation with Method Ref
        List<String> deptList2 = employeeList.stream().map(Employee::getDeptName).collect(Collectors.toList());
        System.out.println(deptList);

        System.out.println(employeeList.stream().count());

    }
}
