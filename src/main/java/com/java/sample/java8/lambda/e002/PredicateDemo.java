package com.java.sample.java8.lambda.e002;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Create Predicate
        Predicate<Integer> lesserThan = i -> (i>18);

        //calling out the predicate
        //test method
        System.out.println(lesserThan.test(20));
    }
}
