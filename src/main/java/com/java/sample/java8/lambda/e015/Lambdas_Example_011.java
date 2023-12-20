package com.java.sample.java8.lambda.e015;

import com.java.sample.java8.lambda.common.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambdas_Example_011 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung A5", 17000f));
        products.add(new Product(3, "Iphone 6S", 65000f));
        products.add(new Product(2, "Sony Xperia", 25000f));
        products.add(new Product(4, "Nokia Lumia", 15000f));
        products.add(new Product(5, "Redmi4 ", 26000f));
        products.add(new Product(6, "Lenevo Vibe", 19000f));

        Stream<Product> filteredData = products.stream().filter(p -> p.price > 20000);
        filteredData.forEach(product -> System.out.println(product.name + ":" + product.price));
    }
}

