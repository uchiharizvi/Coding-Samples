package com.java.sample.exceptions.executorFW.P002;

public class TestTwo implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing Task Two");
            try{
                Thread.sleep(2000);
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
    }
}
