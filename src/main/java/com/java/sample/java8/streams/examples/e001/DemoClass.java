package com.java.sample.java8.streams.examples.e001;

import java.util.List;

public class DemoClass {


    private static int sumIterator(List<Integer> list) {
       //java 7 code
        /*Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;*/
        //java 8 code
        return list.stream().filter(i -> i>10).mapToInt(i -> i).sum();
    }


}
