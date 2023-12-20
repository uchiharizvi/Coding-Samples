package com.java.sample.collectionsFW.interfaces.map.impl.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample_002 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        Map<Integer, String> hm2 = new HashMap<>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        hm2.put(new Integer(1), "Geeks");
        hm2.put(new Integer(2), "For");
        hm2.put(new Integer(3), "Geeks");

        System.out.println(hm);
        System.out.println(hm2);
        }
    }
