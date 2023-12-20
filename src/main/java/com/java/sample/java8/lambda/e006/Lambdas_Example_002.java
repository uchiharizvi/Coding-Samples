package com.java.sample.java8.lambda.e006;

import com.java.sample.java8.functionalinterfaces.Operations;

public class Lambdas_Example_002 {
    public static void main(String[] args) {

        /**Lambda expression without return keyword.**/
        /**Functional Interface Usage using Add Operation**/
        Operations add = (a, b)->(a+b);
        System.out.println(add.performOperation(10,20));
        /**Functional Interface Usage using Substract Operation**/
        Operations sub = (a,b)->(b-a);
        System.out.println(sub.performOperation(10,20));
    }
}
