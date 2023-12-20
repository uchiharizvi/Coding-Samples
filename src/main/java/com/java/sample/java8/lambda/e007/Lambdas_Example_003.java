package com.java.sample.java8.lambda.e007;

import com.java.sample.java8.functionalinterfaces.Operations;

public class Lambdas_Example_003 {
    public static void main(String[] args) {

        /**Lambda expression with return keyword.**/
        /**Functional Interface Usage using Add Operation**/
        Operations add = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(add.performOperation(10, 20));
        /**Functional Interface Usage using Substract Operation**/
        Operations sub = (int a, int b) ->{
            return (b - a);
        };
        System.out.println(sub.performOperation(10, 20));
    }
}
