package com.java.sample.collectionsFW.interfaces.iterable.examples.e001;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Delhi", "India");
        capitals.put("Moscow", "Russia");
        capitals.put("New York", "USA");

        Iterator iterator = capitals.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(capitals.get(iterator.hasNext()));
            capitals.put("Istanbul","Turkey");
        }
    }
}
