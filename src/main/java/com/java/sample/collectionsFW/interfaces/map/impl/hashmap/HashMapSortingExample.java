package com.java.sample.collectionsFW.interfaces.map.impl.hashmap;

import java.util.*;

public class HashMapSortingExample {
    HashMap<?,?> map = new HashMap<>();
    HashMap<?,?> map1 = new HashMap<>(5);
    HashMap<?,?> map2 = new HashMap<>(5,0.5f);

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("One",80);
        hm.put("Two",10);
        hm.put("Three",130);
        hm.put("Four",11);
        hm.put("Five",90);
        hm.put("Six",900);

        System.out.println("Before Sorting " + hm);

        /**Sort by Key**/
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(hm);//put the whole collection
        System.out.println("After Sorting by Key" + sorted);
        /**Sort by Val**/
        List<Map.Entry<String,Integer>> sorted1 = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(sorted1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return(o1.getValue().compareTo(o2.getValue()));
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : sorted1) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println("After Sorting by Value" + temp);
    }


}
