package com.java.sample.collectionsFW.interfaces.map.impl.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample_001 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        for(Map.Entry<String, Integer> e : hm.entrySet()) System.out.println(e.getKey() +" : "+e.getValue());
        }
    }
