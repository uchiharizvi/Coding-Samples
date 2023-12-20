package com.java.sample.java8.streams.examples.e015;


import com.java.sample.utils.StringGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        for(int i=0;i<100;i++){
            namesList.add(StringGenerator.generateStringPlain());
        }
        //Filter Operation
        List<String> aNames = namesList.stream().filter(a->a.startsWith("a")).collect(Collectors.toList());
        List<String> bNames = namesList.stream().filter(b->b.startsWith("b")).collect(Collectors.toList());
        System.out.println("Size : " + namesList.size());//Print Size
        System.out.println("Size : " + namesList.stream().count());//Print Size
        namesList.replaceAll(String::toUpperCase);//Replace Existing List
        //Sort Operation
        Collections.sort(namesList);//sorting
        System.out.println(namesList);
        System.out.println(aNames);
        System.out.println(bNames);

    }
}
