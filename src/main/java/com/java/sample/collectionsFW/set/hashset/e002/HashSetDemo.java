package com.java.sample.collectionsFW.set.hashset.e002;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();
        //Will not add duplicate values
        boolean b = integerSet.add(23);
        boolean b1 = integerSet.add(24);
        HashSet<String> stringSet = new HashSet<>();
        boolean b2 = stringSet.add("Random");
        boolean b3 = stringSet.add("noob");
        boolean b4 = stringSet.add("noob");
        //To check if the addition was successful
        System.out.println("b = " + b + "\n" + "b1 = " + b1 + "\n" + "b2 = " + b2 + "\n" + "b3 = " + b3 + "\n" + "b4 = " + b4);
        System.out.println("Integer Set : " + integerSet + "\n" + "String Set :" + stringSet );
    }


}
