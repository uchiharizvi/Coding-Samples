package com.java.sample.core.markupinterface.cloneable.shallow;

public class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
