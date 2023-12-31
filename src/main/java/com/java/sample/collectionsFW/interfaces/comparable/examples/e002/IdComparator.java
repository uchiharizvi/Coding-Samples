package com.java.sample.collectionsFW.interfaces.comparable.examples.e002;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getId() < s2.getId()) return -1;
        if (s1.getId() > s2.getId()) return 1;
        else return 0;
    }
}
