package com.java.sample.java8.lambda.e001;

import java.io.IOException;
import java.io.OutputStream;

public interface DemoInterface {

    void printIf(String text);
    default public void printUtf8To(String text, OutputStream outputStream){
        try{
            outputStream.write(text.getBytes("UTF-8"));
        }catch (IOException ioe){
            throw new RuntimeException("Error writing String as UTF-8 to outputStream", ioe);
        }

    }

    static void printItToSystem(String text){
        System.out.println(text);
    }
}
