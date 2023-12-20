package com.java.sample.java8.lambda.e011;

import com.java.sample.java8.functionalinterfaces.Speakable;

public class Lambdas_Example_007 {
    public static void main(String[] args) {
        Speakable speak = (name) -> "Hello " + name;
        System.out.println(speak.speak("Kavish"));
    }
}
