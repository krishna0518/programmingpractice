package com.pattern;

/*
pattern 3
12345
12345
12345
12345
12345
 */
public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
