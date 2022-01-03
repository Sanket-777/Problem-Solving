package com.Sanket.Bitwise;

public class findnumberdigit {
    public static void main(String args[])
    {
        int a =10;//number
        int b=2;//base

        int ans = (int)((Math.log(a)/Math.log(b))+1);
        System.out.println(ans);
    }
}
