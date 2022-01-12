package com.Sanket.Codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public  class SpecialFibbo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--)!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(fib(a, b, n));


            // your code goes here
        }

    }

    public static int fib(int a,int b,int n){
        if(n == 0)
            return a;

        if(n == 1)
            return b;

        if(n == 2)
            return a ^ b;


        return fib(a,b,n % 3);
    }
}

