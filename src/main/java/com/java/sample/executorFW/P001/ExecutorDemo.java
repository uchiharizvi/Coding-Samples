package com.java.sample.executorFW.P001;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

    private static ExecutorService executorService = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;

    public static void main(String[] args) {
        //creation of fixed thread pool of size 2 . This thread pool will contain 2 worker threads
        executorService = Executors.newFixedThreadPool(2);
        while (true) {
            try {
                checkTasks();
//force the thread to wait for 1 second
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTasks() throws Exception {
        if(taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()){
            taskOneResults = executorService.submit(new TestOne());
        }
        if(taskTwoResults == null || taskTwoResults.isDone() || taskTwoResults.isCancelled()){
            taskTwoResults = executorService.submit(new TestTwo());
        }
    }

}
