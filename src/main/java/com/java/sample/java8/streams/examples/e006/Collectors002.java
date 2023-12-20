package com.java.sample.java8.streams.examples.e006;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert elements to strings and concatenate them, separated by commas
 **/
public class Collectors002 {
    public static void main(String[] args) {
        List<Object> things = new ArrayList<>();
        things.add("Animal");
        things.add("Vehicle");
        things.add(1);
        String joined = things.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}

