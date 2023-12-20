package com.java.sample.executorFW.examples.e001;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        Task task = new Task("Kavish");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> result = executorService.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error occurred while executing the submitted task");
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}

class Task implements Callable<String> {
    private String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        return "Hello " + message + "!";
    }
}
