package com.pattern;

/*
Pattern5
54321
54321
54321
54321
54321
 */
public class Pattern5 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=5;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
