package com.java.sample.core.markupinterface.cloneable.shallow;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 test2 = new Test2();
        test2.a = 10;
        test2.b = 20;
        test2.c.x = 30;
        test2.c.y = 40;
        System.out.println(test2.a + " " + test2.b + " " + test2.c.x + " " + test2.c.y);
        Test2 test21 = (Test2) test2.clone();
        test21.a = 100;
        test21.c.x = 300;
        System.out.println(test2.a + " " + test2.b + " " + test2.c.x + " " + test2.c.y);
        System.out.println(test21.a + " " + test21.b + " " + test21.c.x + " " + test21.c.y);
    }
}
