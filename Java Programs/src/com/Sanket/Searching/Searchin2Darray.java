package com.Sanket;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,51,32,5,2,},
                {22,88,33,55,44}
        };
        int target = 88;
        int [] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int[][] arr, int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target==arr[row][col])
                {
                    return new int[]{row,col};
                }
                
            }
            
        }
        return new int[]{-1,-1};
    }
}
