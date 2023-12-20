package com.java.sample.java8.streams.examples.e009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> number = new ArrayList<>();
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println("List of list-" + number);

        /**flatMap() usage**/
        List<Integer> flatList = number.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("List generate by flatMap-" + flatList);
    }
}
