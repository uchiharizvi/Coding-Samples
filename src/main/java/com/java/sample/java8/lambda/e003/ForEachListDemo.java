package com.java.sample.java8.lambda.e003;

import java.util.ArrayList;
import java.util.List;

public class ForEachListDemo {
    public static void main(String[] args) {
        //Create a sample list
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //lambda output [A,B,C,D,E]
        items.forEach(item -> System.out.println(item));

        //lambda output C
        items.forEach(item -> {
            if("C".equals(item)){
                System.out.println(item);
            }
        });
        //method reference
        items.forEach(System.out::println);
        //Stream and filter
        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
