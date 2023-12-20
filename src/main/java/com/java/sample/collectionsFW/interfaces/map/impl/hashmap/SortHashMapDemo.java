package com.java.sample.collectionsFW.interfaces.map.impl.hashmap;

import java.util.*;

/**
 * WAP sort HashMap based on Key and Value
 **/
public class SortHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Kavish");
        names.put(99, "Suresh");
        names.put(34, "Tooba");
        System.out.println("Before Sorting");
        print(names);
        System.out.println("Sorting on Key");
        sortByKey(names);
        System.out.println("Sorting on Value");
        print(sortByValue(names));
    }

    static void print(HashMap<Integer, String> names) {
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    static void sortByKey(HashMap<Integer, String> names) {
        TreeMap<Integer, String> sort = new TreeMap<>();
        sort.putAll(names);
        for (Map.Entry<Integer, String> entry : sort.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    static HashMap sortByValue(HashMap<Integer, String> names) {
        //Create List from Hashmap
        List<Map.Entry<Integer, String>> namesList = new LinkedList<>(names.entrySet());
        //Sort the list
        Collections.sort(namesList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        // put data from sorted list to hashmap
        HashMap<Integer, String> temp = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry:namesList) temp.put(entry.getKey(),entry.getValue());
        return temp;
    }
}
