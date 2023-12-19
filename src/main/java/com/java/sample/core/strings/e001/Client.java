package com.java.sample.core.strings.e001;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        ImmutableDemo immutableDemo = new ImmutableDemo(i, s, h1);

        //Lets see whether its copy by field or reference
        System.out.println(s == immutableDemo.getName());
        System.out.println(h1 == immutableDemo.getTestMap());
        //print the ce values
        System.out.println("ce id:" + immutableDemo.getId());
        System.out.println("ce name:" + immutableDemo.getName());
        System.out.println("ce testMap:" + immutableDemo.getTestMap());
        //change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:" + immutableDemo.getId());
        System.out.println("ce name after local variable change:" + immutableDemo.getName());
        System.out.println("ce testMap after local variable change:" + immutableDemo.getTestMap());

        HashMap<String, String> hmTest = immutableDemo.getTestMap();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods:" + immutableDemo.getTestMap());

    }
}
