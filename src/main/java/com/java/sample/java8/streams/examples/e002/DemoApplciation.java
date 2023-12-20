package com.java.sample.java8.streams.examples.e002;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class DemoApplciation {

    public static void main(String[] args) {
        Instant start = Instant.now();
        LinkedList<String> dataList = new LinkedList<>();
        List<Boolean> newList = new LinkedList<>();
        List<String> sortedList = new ArrayList<>();

        System.out.println("Input....");
        List<String> alpha = Arrays.asList("amit", "rajesh", "narendra", "Kavish");
        List<String> upperList = alpha.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println("ListItem : " + alpha);
        System.out.println("In Uppercase and sorted : " + upperList);
        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("The listitems : " + num + "After Processing n*2 : " + collect1); //[2, 4, 6, 8, 10]
        /*for(int i=0;i<10;i++){
            dataList.add(generateRandomString());
        }*/
        //System.out.println("Random String : " + dataList);

        //System.out.println("Count : " + dataList.stream().count());
        System.out.println("Count using parallel stream : " + dataList.parallelStream().count());
        //sortedList = dataList.parallelStream().sorted().collect(Collectors.toList());
        //System.out.println("Before Sorting : " + dataList );
        //System.out.println("After Sorting : " + sortedList);
        sortedList = dataList.stream().filter(i -> i.endsWith("a")).collect(Collectors.toList());
         //newList = dataList.stream().map(i -> i.indexOf("e")).count();
        System.out.println("Original List : " + dataList);
        System.out.println("Items Ending with a : " + sortedList);
        System.out.println(newList);

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
        System.out.println("Time Elapsed in MS : " + timeElapsed);
    }

    private static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 9;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
