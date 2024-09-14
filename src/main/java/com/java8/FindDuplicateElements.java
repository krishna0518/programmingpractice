package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,2,3,4,5,6,7,8,9,8,9);
        
        Set<Integer> set = new HashSet<>();

        Set<Integer> collect = list.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());

        System.out.println("Duplicate Element");
        System.out.println(collect);

        System.out.println("Set values");
        System.out.println(set);

    }
}
