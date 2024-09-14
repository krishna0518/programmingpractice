package com.wrapper;

public class Demo {
    public static void main(String[] args) {
        Integer i = new Integer("22");
        Integer i3 = 22;
        Integer i2 = Integer.valueOf("22");

        System.out.println(i3==i2);
    }
}
