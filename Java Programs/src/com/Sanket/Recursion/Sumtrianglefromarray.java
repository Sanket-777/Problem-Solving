package com.Sanket.Recursion;

import java.io.*;

class Sumtrainglefromarray {
    public static void main (String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        System.out.println(sumtriangle(arr));
    }
    static int sumtriangle(int [] arr)
    {
        int sumtrianglearray[] = new int[arr.length - 1];

        if(arr.length == 1)
        {
            return arr[0];
        }

        for(int i = 0;i < arr.length -  1 ;i++)
        {
            sumtrianglearray[i] = arr[i]  + arr[i + 1];
        }

        return sumtriangle(sumtrianglearray);

    }
}
