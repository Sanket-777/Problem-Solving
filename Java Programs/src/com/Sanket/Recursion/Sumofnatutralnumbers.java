package com.Sanket.Recursion;

public class Sumofnatutralnumbers {

    public static void main(String args[]){
        System.out.print(Sum(10));
    }

    static int Sum(int n){
        if(n == 1)
            return 1;
        return n+Sum(n-1);
    }
}
