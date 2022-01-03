package com.Sanket.Recursion;

import java.util.Arrays;

public class BubblesortUsingrecursion {

    public static void main(String args[]){
        int ch[] = {5,3,22,66,34,12,97,24,752,56,34};
        bubble(ch,ch.length);
        System.out.print(Arrays.toString(ch));
    }
    static void bubble(int ch[],int n){
        if(n == 1)
            return;

        for(int i = 0;i < n-1;i++){
            if(ch[i] > ch[i+1]){
                int temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;
            }
             bubble(ch,n-1);
        }

    }
}
