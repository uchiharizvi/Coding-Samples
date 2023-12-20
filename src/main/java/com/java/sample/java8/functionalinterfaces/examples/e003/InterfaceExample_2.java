package com.java.sample.java8.functionalinterfaces.examples.e003;

public interface InterfaceExample_2 {
    default void newMethod() {
        System.out.println("default method");
    }

    void display(String str);
}
