package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","python","c#","java","kotlin","python");
        List<String> uniquelist = list.stream().distinct().collect(Collectors.toList());

        System.out.println(uniquelist);
    }
}
