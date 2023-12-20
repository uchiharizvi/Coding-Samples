package com.java.sample.collectionsFW.interfaces.set.hashset.e001;


import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]) {


        Employee e1 = new Employee("1", 20);
        Employee e2 = new Employee("1", 20);
        Employee e3 = new Employee("2", 20);


        HashSet<Employee> hs = new HashSet<>();
        hs.add(e2);
        hs.add(e1);
        System.out.println(hs.size());
        //System.out.println(hs.);

    }
}

// A 1 B 2
// C compilation Errro d none ofthis

