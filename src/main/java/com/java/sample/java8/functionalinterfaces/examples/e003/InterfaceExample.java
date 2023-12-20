package com.java.sample.java8.functionalinterfaces.examples.e003;

public interface InterfaceExample {
    default void newMethod() {
        System.out.println("default method");
    }

    void existingMethod(String str);
}
