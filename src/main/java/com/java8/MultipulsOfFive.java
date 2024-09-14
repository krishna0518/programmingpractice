package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipulsOfFive {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> multiplesofFive = listOfIntegers.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
        multiplesofFive.forEach(System.out::println);
    }
}
