package com.java.sample.utils;

import java.nio.charset.Charset;
import java.util.Random;

public class StringGenerator {

    public static String generateStringUnbounded() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String randomString = new String(array, Charset.forName("UTF-8"));

        return randomString;
    }

    public static String generateStringPlain() {
        int leftLimit = 97;//letter a
        int rightLimit = 122;//letter z
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);//create of size 10
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String randomString = buffer.toString();
        return randomString;
    }
}
