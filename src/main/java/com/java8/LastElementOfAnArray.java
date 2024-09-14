package com.java8;

import java.util.Arrays;
import java.util.List;

public class LastElementOfAnArray {
    public static void main(String[] args) {
        Integer arrayOfInteger[] = {1,2,3,4,5,6,7,8,9};

        List<Integer> list = Arrays.asList(arrayOfInteger);

        Integer last = list.stream().findFirst().get();

        System.out.println(last);
    }
}
