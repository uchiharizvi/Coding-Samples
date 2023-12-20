package com.java.sample.java8.streams.examples.e017;

import java.util.Arrays;
import java.util.List;

public class StreamsReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        //Java 7
        int result = 0;
        for(int i: numbers) result = result + i;//Mutation - No Concurrency can be achieved
        System.out.println("Java 7 : " + result);
        //Java 8
        System.out.println("Java 8 : " + numbers.stream().map(x->x).reduce(0,(y,z)->y+z));
    }
}
