package com.Sanket.Recursion;

public class Sumofdigitsofanumber {
    public static void main(String args[]){
        int num = 12345;
        int sum = sumofdigits(num);
        System.out.print(sum);
    }
    static int sumofdigits(int num){
        if(num == 0)
            return 0;

        return (num % 10 + sumofdigits(num/10));
    }
}
