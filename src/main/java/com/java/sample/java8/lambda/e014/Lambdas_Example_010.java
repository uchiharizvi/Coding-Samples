package com.java.sample.java8.lambda.e014;

import com.java.sample.java8.lambda.common.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambdas_Example_010 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Keyboard", 300f));
        products.add(new Product(3, "Dell Mouse", 150f));

        System.out.println("Sorting on Name Basis...");

        Collections.sort(products, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product product : products) System.out.println(product.id + " " + product.name + " " + product.price);
    }
}

