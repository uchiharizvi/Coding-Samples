package com.java.sample.java8.methodref.examples.e001;

import com.java.sample.java8.functionalinterfaces.Sayable;

public class MethodReference_Example_001 {
    public static void main(String[] args) {
        Sayable say = MethodReference_Example_001::saySomething;
        say.say();
    }
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
}
