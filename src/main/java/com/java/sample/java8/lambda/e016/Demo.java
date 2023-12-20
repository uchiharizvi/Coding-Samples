package com.java.sample.java8.lambda.e016;

import com.java.sample.java8.functionalinterfaces.examples.e002.ExampleInterface;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        //Functional Interface Lambda Implementation
        ExampleInterface hello = () -> System.out.println("Hello World!");
        hello.world();
        LinkedList<Integer> childrenAges = new LinkedList<Integer>(Arrays.asList(2, 4, 5, 7));
        childrenAges.forEach(age -> System.out.println("one of the children age is " + age));
        String[] arr = {"family", "illegibly", "acquired", "know", "perplexing", "do", "not", "doctors", "where", "handwriting", "I"};
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arr));

        String message = "Anything";
        /*Speakable speakable = x->x.toLowerCase(Locale.ROOT).compareTo()*/
        //Calculate calc = ((20, 40)->System.out.println(20 + 40));
    }
}
