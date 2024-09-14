package com.data.structures;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {

        int arr[] = {2,5,6,4,1,3,9,8,7};
       // Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("********streams **************");

        int a[] = Arrays.stream(arr).sorted().toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
