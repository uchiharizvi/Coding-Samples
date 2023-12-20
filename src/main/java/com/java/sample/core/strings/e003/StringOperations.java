package com.java.sample.core.strings.e003;

public class StringOperations {
    public static void main(String[] args) {
        String s1  = "Hello";
        String s2 = new String("Hello");
        String s3 = s1.intern();

        if(s1 == s2) System.out.println("true");
        else System.out.println("false");
        if(s1 == s3) System.out.println("true");
        else System.out.println("false");
        if(s1.equals(s2)) System.out.println("true");
        else System.out.println("false");
    }
}
