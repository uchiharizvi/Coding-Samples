package com.java.sample.java8.lambda.e001;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");

        pointList.forEach(p -> {
                    System.out.println(p);
                    //Do more work
                }
        );
    }
}

