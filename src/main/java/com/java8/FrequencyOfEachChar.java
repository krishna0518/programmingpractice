package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> collect = inputString.toLowerCase(Locale.ROOT)
                                        .chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        System.out.println("=======================================================");
    }
}
