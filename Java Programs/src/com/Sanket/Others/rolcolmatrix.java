package com.Sanket.Others;

import java.util.Arrays;

public class rolcolmatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,44},
                {12,22,34,47},
                {15,29,38,48},
                {20,34,45,50}

        };
        int target=34;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static  int[] search(int [][]matrix,int targert)
    {
        int r=0;
        int c=matrix.length-1;
         while (r< matrix.length && c >=0)
         {
             if(matrix[r][c]==targert)
             {
                 return  new int []{r,c};
             }
             if (matrix[r][c]<targert)
             {
                 r++;
             }
             else
             {
                 c--;
             }
         }
        return new int[]{-1,-1};
    }
}
