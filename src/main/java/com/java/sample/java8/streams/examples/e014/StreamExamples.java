package com.java.sample.java8.streams.examples.e014;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        //1. Integer Stream
        IntStream//Anonymous Class
                .range(1, 10)//10 is non inclusive
                .forEach(System.out::print);
        System.out.println();
        //2. Integer Stream with Skip
        IntStream//Anonymous Class
                .range(1, 10)//10 is non inclusive
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();
        //3. Integer Stream with sum
        System.out.println(
                IntStream//Anonymous Class
                        .range(1, 5)//5 is non inclusive
                        .sum());//terminal Operation
        System.out.println();
        //4. Sorted and Find First
        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(s-> System.out.println(s));
        //4. Stream of array,sort,filter and print
        List<String> names = Arrays.asList("Al","Ava","Ankit","Joshua","Brent","amanda","Sarika");
        names.stream()
                .filter(x->x.startsWith("A"))
                .sorted()
                .forEach(s -> System.out.println(s));
        //5. average of squares
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x->x*x)
                .average()
                .ifPresent(s-> System.out.println(s));

    }
}
