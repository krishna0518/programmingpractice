package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDecimalInReverseOrder {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sortedDecimalList = decimalList.stream().sorted().collect(Collectors.toList());

        List<Double> reverseSortedDecimalList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //System.out.println("Sorted");
        //sortedDecimalList.forEach(System.out::println);

        //System.out.println("Reverse Sorted");

        //reverseSortedDecimalList.forEach(System.out::println);

        List<String> names = Arrays.asList("Pen", "Eraser", "Note Book", "Pen1", "Pencil", "Stapler", "Note Book1", "Pencil1");

        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("================Sorted==================");
        sortedNames.forEach(System.out::println);

        System.out.println("===============Reverse Sorted===========");
        List<String> reverseSortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseSortedNames.forEach(System.out::println);


    }
}
