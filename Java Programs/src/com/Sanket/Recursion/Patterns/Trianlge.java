package com.Sanket.Recursion.Patterns;

import java.util.Arrays;

/*
*****
****
***
**
* */
public class Trianlge {

    public static void main(String[] args) {
//        triangle2(4,0);
//        System.out.println();
//        triangle(4,0);
        int arr[] = {4,3,2,5,1};
//        System.out.println(Arrays.toString(arr));
//        bubblesort(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        seelctionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
     static void triangle(int r,int c)
     {
         if(r ==  0)
         {

             return;
         }
         if(c < r)
         {
             System.out.print(" * ");
             triangle(r,c+1);
         }
         else
         {
             System.out.println();
             triangle(r-1,0);
         }
     }
    static void triangle2(int r,int c)
    {
        if(r ==  0)
        {

            return;
        }
        if(c < r)
        {

            triangle2(r,c+1);
            System.out.print(" * ");
        }
        else
        {

            triangle2(r-1,0);
            System.out.println();
        }
    }
    static void bubblesort(int arr[],int r,int c) {
        if (r == 0) {

            return;
        }
        if (c < r) {  // r is the index of element that we are going to check
            if(arr[c] > arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr,r, c + 1);
        } else {
            bubblesort(arr,r - 1, 0);
        }
    }
    static void seelctionsort(int arr[],int r,int c,int max) {
        if (r == 0) {
            if (c < r) {  // r is the index of element that we are going to check
                if (arr[c] > arr[max]) {
                    seelctionsort(arr, r, c + 1, c);

                } else {
                    seelctionsort(arr, r, c + 1, max);

                }
            } else {
                int temp = arr[max];  //last elemnt is row -1
                arr[max] = arr[r - 1];
                arr[r - 1] = temp;
                seelctionsort(arr, r - 1, 0, 0);
            }
        }
    }}
