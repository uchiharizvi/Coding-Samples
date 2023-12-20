package com.java.sample.executorFW.P002;

public class TestThree implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing Task Three");
            try{
                Thread.sleep(2000);
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
    }
}
