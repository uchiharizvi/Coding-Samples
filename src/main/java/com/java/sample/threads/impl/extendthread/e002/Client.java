package com.java.sample.threads.impl.extendthread.e002;

public class Client {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
