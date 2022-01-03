package com.Sanket.Recursion;

public class Nto1 {
    public static void main(String []args){
        funfboth(5);
    }

    static void funf(int n)
    {
        if( n == 0)
            return;

        System.out.print(n);
        funf(n-1);
    }
    static void funfrev(int n)
    {
        if( n == 0) {
            return;
        }

        funfrev(n-1);
        System.out.println(n);
    }
    static void funfboth(int n)
    {
        if( n == 0) {
            return;
        }
        System.out.println(n);
        funfboth(n-1);
        System.out.println(n);
    }
}
