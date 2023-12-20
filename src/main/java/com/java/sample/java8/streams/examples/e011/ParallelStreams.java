package com.java.sample.java8.streams.examples.e011;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        //Sequential Stream
        listOfNumbers.stream()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
        //Parallel Stream
        listOfNumbers.parallelStream()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
        int sum = listOfNumbers.parallelStream().reduce(5,Integer::sum);
        int sum2 = listOfNumbers.stream().reduce(5,Integer::sum);
        System.out.println(sum + "," + sum2);

    }
}
