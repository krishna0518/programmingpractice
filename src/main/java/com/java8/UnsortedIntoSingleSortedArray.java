package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UnsortedIntoSingleSortedArray {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int [] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();

        /*for(int i : c)
        {
           System.out.println(i);
        }*/

        int[] a1 = new int[] {4, 2, 5, 1};

        int[] b1 = new int[] {8, 1, 9, 5};

        int[] distinctSortedArray = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1))
                                                .sorted()
                                                .distinct()
                                                .toArray();

        for(int i : distinctSortedArray)
        {
            System.out.println(i);
        }
    }
}
