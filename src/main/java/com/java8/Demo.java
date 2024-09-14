package com.java8;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 5;
        System.out.println("the length of the string is greater than 5 : " + p.test("code decode"));

    }
}
