package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SepOddAndEvenNum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

        Map<Boolean, List<Integer>> ByThreeCollect = list.stream().collect(Collectors.partitioningBy(i -> i % 3 == 0));

        Map<Boolean, List<Integer>> oddOrEvenCollect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> oddOrEvenEntrySet = oddOrEvenCollect.entrySet();

        ByThreeCollect.forEach((key, value) -> {
            if(key)
            {
                System.out.println("By Three Numbers");
            }
            else
            {
                System.out.println("Not by Three numbers");
            }
            System.out.println("--------------------------------------");
            List<Integer> value1 = value;
            for (int i : value1)
            {
                System.out.println(i);
            }

        });

        for(Map.Entry<Boolean, List<Integer>> entry : oddOrEvenEntrySet)
        {
            System.out.println("-----------------------------------");
            if(entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else {
                System.out.println("Odd numbers");
            }
            System.out.println("--------------------------------------");

            List<Integer> value = entry.getValue();

            for(int i : value)
            {
                System.out.println(i);
            }
        }

    }
}
