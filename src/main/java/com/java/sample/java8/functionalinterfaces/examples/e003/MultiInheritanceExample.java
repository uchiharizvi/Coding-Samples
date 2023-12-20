package com.java.sample.java8.functionalinterfaces.examples.e003;

public class MultiInheritanceExample implements InterfaceExample, InterfaceExample_2 {
    @Override
    public void newMethod() {
        System.out.println("default method");
        ;
    }

    @Override
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    @Override
    public void display(String str) {
        System.out.println("String is: " + str);
    }
}
