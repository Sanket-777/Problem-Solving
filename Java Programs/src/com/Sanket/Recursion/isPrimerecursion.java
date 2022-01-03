package com.Sanket.Recursion;

public class isPrimerecursion {
    public static void main(String args[]){
        System.out.print(isPrime(56,2));
    }

    static boolean isPrime(int n,int p){
        if(n <= 2)
            return (n == 2)? true : false;
        if( n % p == 0)
            return false;
        if(p * p > n)
            return true;

        return isPrime(n,p+1);

    }
}
