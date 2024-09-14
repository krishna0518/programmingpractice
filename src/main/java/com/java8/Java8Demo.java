package com.java8;

public class Java8Demo {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("java");
        System.out.println(sbf.reverse());

        String str = "java";
        char [] strArray = str.toCharArray();
        for(int i = strArray.length-1; i>=0;i--)
        {
            System.out.print(strArray[i]);
        }
        System.out.println();
        System.out.println(recursiveMethod("java"));
    }

    static String recursiveMethod(String str)
    {
        if((null == str) || (str.length() <= 1))
        {
            return  str;
        }
        return  recursiveMethod(str.substring(1))+str.charAt(0);
    }
}
