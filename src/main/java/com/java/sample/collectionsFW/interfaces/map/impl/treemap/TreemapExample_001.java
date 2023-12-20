package com.java.sample.collectionsFW.interfaces.map.impl.treemap;
import java.util.*;
public class TreemapExample_001 {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap<>();
        tm.put("vishal", 10);
        tm.put("sachin", 30);
        tm.put("vaibhav", 20);
        for(Map.Entry<String, Integer> e:tm.entrySet()) System.out.println(e.getKey() + " : " + e.getValue());
    }
}
