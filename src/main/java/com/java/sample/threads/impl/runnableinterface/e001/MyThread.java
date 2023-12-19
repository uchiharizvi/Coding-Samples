package com.java.sample.threads.impl.runnableinterface.e001;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started");
    }
}
