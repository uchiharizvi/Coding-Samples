package com.java.sample.java8.streams.e003;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {
        List<Employee> staff = Arrays.asList(
                new Employee("mkyong", 30, new BigDecimal(10000)),
                new Employee("jack", 27, new BigDecimal(20000)),
                new Employee("lawrence", 33, new BigDecimal(30000))
        );
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic staffPublic = new StaffPublic();
            staffPublic.setName(temp.getName());
            staffPublic.setAge(temp.getAge());
            if("mkyong".equals(temp.getName())){
                staffPublic.setExtra("This field is for mykong only!");
            }
            return staffPublic;
        }).collect(Collectors.toList());

        System.out.println(result.toString());
    }
}
