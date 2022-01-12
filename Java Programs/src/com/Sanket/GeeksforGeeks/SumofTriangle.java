package com.Sanket.GeeksforGeeks;

import java.util.Arrays;

//Sum triangle from array
//        Difficulty Level : Easy
//        Last Updated : 10 Jun, 2021
//        Given an array of integers, print a sum triangle from it such that
//        the first level has all array elements.From then, at each level number
//        of elements is one less than the previous level and elements at the
//        level is be the Sum of consecutive two elements in the previous level
public class SumofTriangle {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sumoftriangle(arr);
       // printTriangle(arr);
    }
    static  void sumoftriangle(int []arr)
    {
        if(arr.length == 0)
        {
            return;
        }
        int arr2 []  = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i] + arr[i+1];
            arr2[i] = x;
        }


        sumoftriangle(arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static void printTriangle(int[] A)
    {
        // Base case
        if (A.length < 1)
            return;

        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }

        // Make a recursive call and pass
        // the newly created array
        printTriangle(temp);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(A));
    }
}
