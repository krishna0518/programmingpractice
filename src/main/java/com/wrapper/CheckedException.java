package com.wrapper;

public class CheckedException {
    public static void main(String[] args) {
        CheckedException c = new CheckedException();
        c.display(10);
    }

    public void display(int a) {

        if(a < 15 )
        {
            throw new RuntimeException("unchecked exception");
        }
    }
}
