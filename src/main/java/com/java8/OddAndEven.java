package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddAndEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> entries = collect.entrySet();

        for(Map.Entry<Boolean, List<Integer>> entry : entries)
        {
            if(entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd");
            }
            System.out.println("----------------------");
            List<Integer> list1 = entry.getValue();

            for (Integer i : list1)
            {
                System.out.println(i);
            }
        }
    }
}
