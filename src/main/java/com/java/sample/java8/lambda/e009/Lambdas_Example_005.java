package com.java.sample.java8.lambda.e009;

import com.java.sample.java8.functionalinterfaces.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Lambdas_Example_005 {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = ()-> System.out.println("Drawing " + width);
        drawable.draw();
    }
}
