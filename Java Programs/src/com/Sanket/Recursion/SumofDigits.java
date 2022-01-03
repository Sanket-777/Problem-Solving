package com.Sanket.Recursion;

public class SumofDigits {
    public static void main(String args[]){
        System.out.print(Sum(123456789));
    }

    static int Sum(int n){
        if(n == 0)
            return 0;

        return (n%10) + Sum(n/10);
    }
}
