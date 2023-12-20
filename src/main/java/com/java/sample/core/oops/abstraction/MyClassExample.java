package com.java.sample.core.oops.abstraction;

public class MyClassExample implements MyInterface{
    @Override
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        MyClassExample obj = new MyClassExample();
        obj.newMethod();
        MyInterface.anotherNewMethod();
        obj.existingMethod("Hello");
    }
}
