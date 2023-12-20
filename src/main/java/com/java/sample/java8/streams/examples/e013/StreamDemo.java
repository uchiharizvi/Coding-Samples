package com.java.sample.java8.streams.examples.e013;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        //Stream-Map
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        //Stream-Filter
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        //Stream-Sorted
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        //Stream-Map with set
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 2);
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);
        //stream-map-foreach
        numbers.stream().map(x -> x * x).forEach(y -> System.out.println(y));
        //stream-reduce
        List<Integer> evenNo = Arrays.asList(2, 4, 6, 8, 10);
        int even = evenNo.
                stream().
                filter(x -> x % 2 == 0).
                reduce(0, (ans, i)
                        -> ans + i
                );
        System.out.println("Even : " + even);
    }
}
