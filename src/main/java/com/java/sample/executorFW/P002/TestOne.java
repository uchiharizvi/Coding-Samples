package com.java.sample.executorFW.P002;

public class TestOne implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing Task One");
            try{
                Thread.sleep(2000);
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
    }
}
