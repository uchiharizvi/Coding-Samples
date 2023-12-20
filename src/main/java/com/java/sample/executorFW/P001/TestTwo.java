package com.java.sample.executorFW.P001;

public class TestTwo implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing Task Two");
            try{
                Thread.sleep(1000);
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
    }
}
