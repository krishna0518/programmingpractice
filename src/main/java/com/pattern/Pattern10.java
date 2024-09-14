package com.pattern;
/*
112131
122232
132333
142434
152535
 */
public class Pattern10 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j+""+i);
            }
            System.out.println();
        }
       /* for (int i=1;i<=5;i++)
        {
            int a=1;
            for (int j=1;j<=6;j++)
            {

                if(j%2==0)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(a);
                    a++;
                }
            }
            System.out.println();
        }*/
    }
}
