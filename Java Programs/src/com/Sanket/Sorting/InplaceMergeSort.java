package com.Sanket.Sorting;

import java.util.Arrays;

public class InplaceMergeSort{
    public static void main(String[] args) {
        int []arr = {5,8,5,7,4,2,3,1};
        mergesortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static  void mergesortInplace(int arr[],int start,int end)
    {
        if(end - start == 1)
        {
            return  ;
        }


        int mid = (start + end) /2;  //finding the middle point of the array
        mergesortInplace(arr,start,mid); // making the first half
        mergesortInplace(arr,mid,end); //making the second half
        mergeInplace(arr,start,end,mid); // merging the arrays into one array
    }

    private static void mergeInplace(int []arr,int start,int end,int mid) {
        int mix[]  = new int[end - start];
        int i = start;   //initialising all the indexes to xero for all the three arrays
        int k = 0;
        int j = mid;
        while (i < mid && j < end)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //if the length of the two arrays are not equal the this part will execute
        //anyone of the  two while loops will execute.

        while (i < mid)
        {
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j < end)
        {
            mix[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l <mix.length ; l++) {
            arr[start+l] =mix[l];
        }
    }
}
