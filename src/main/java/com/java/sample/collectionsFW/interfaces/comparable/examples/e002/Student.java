package com.java.sample.collectionsFW.interfaces.comparable.examples.e002;

public class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        if (age == s.age) return 0;
        else if (age > s.age) return 1;
        else return -1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

}
