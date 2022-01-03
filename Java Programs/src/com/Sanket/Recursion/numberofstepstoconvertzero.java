package com.Sanket.Recursion;

public class numberofstepstoconvertzero {
    public static void main(String args[]){
        System.out.print(numberOfSteps(15));
    }
    public static int numberOfSteps(int num){
        if(num != 0){
            if(num%2 == 0)
                return 1+numberOfSteps(num/2);
            else
                return 1+numberOfSteps(num-1);
        }
        return 0;
    }
}
