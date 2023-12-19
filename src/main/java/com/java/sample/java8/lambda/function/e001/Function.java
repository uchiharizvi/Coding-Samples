package com.java.sample.java8.lambda.function.e001;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
