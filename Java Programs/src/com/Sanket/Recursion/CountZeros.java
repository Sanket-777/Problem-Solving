package com.Sanket.Recursion;

public class CountZeros {
    public static void main(String args[]){
        System.out.print(checkzero(21000000));
    }

    static int checkzero(int n){
        return helper(n,0);
    }

    private static int helper(int n,int c){
        if(n == 0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,c+1);
        }

        return helper(n/10,c);
    }
}
