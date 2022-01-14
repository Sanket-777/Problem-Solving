package com.Sanket.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  int[] mergesort(int arr[])
    {
        if(arr.length == 1)
        {
            return  arr;
        }


        int mid = arr.length/2;  //finding the middle point of the array
        int left[] = mergesort(Arrays.copyOfRange(arr,0,mid)); // making the first half
        int right[] = mergesort(Arrays.copyOfRange(arr,mid,arr.length)); //making the second half
        return  merge(left,right); // merging the arrays into one array
    }

    private static int[] merge(int[] left, int[] right) {
        int mix[]  = new int[left.length + right.length];
        int i = 0;   //initialising all the indexes to xero for all the three arrays
        int k = 0;
        int j = 0;
        while (i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        //if the length of the two arrays are not equal the this part will execute
        //anyone of the  two while loops will execute.

        while (i < left.length)
        {
            mix[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length)
        {
            mix[k] = right[j];
            k++;
            j++;
        }
        return  mix;
    }


}
