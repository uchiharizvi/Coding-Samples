package com.java.sample.java8.lambda.e013;

public class Lambdas_Example_009 {
    public static void main(String[] args) {
        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Runnable r2 = ()-> System.out.println("Thread 2 is running...");
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
