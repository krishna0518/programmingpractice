package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8);

        Map<Integer, Integer> countMap = list.stream().collect(Collectors.toMap(
                number -> number,
                number -> Collections.frequency(list, number),
                (exitingValue, newValue)-> exitingValue));

        System.out.println(countMap);
    }
}
