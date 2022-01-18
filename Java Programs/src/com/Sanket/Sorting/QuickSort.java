package com.Sanket.Sorting;

import java.util.Arrays;
//worst O (n * n)
//average O(nlogn)
//this is one approach there can be another approach but all the thing remains the same like the complexity n all
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,6,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = {64,2,5,2,8,5,3,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void sort(int [] arr,int low,int high)  //low and high are to keep record of which part of the array we are working on
    {
        if(low >= high)
            return;
        //start and end are ofr the swapping part
        int s = low; //start
        int e = high;//end
        int m =s + (e - s)/2;  //mid taking the middle element as a pivot
        int pivot = arr[m];
         while (s <=  e)
         {
             while (arr[s] < pivot)
             {
                 s++;
             }
             while (arr[e] > pivot)
             {
                 e--;
             }
             //this for loop will only excecute iff anyone of the while loop is violated
             if(s <= e)  // this condition might be violated possibly
             {
                 //swapping
                 int temp =  arr[s];
                 arr[s] = arr[e];
                 arr[e] = temp;
                 s++;
                 e--;
             }
         }

         //now my pivot is at correct index just need to sort the two half;
         sort(arr,low,e);  //for the first half
         sort(arr,s,high);  // for the second half


    }
}
