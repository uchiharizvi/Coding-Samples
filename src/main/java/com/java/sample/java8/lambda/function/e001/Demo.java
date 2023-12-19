package com.java.sample.java8.lambda.function.e001;

public class Demo {
    public static void main(String[] args) {
        //Functionla Interface declaration and defining what it should do(ed; return index of)
        Function<String, Integer> func = x -> x.length();
        //Already defined in func that it should return the 2nd param Integer when apply() is invoked
        Integer apply = func.apply("myKong");
        System.out.println(apply);

    }
}
