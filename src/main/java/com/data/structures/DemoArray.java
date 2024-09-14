package com.data.structures;

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3 ,4 ,5 };

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter next number : ");
        int a = scan.nextInt();

        System.out.println(a);
    }
}
