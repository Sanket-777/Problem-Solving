package com.Sanket.Others;

//Simple Binary Search Alogorithm
public class    Main {
    public static void main(String[] args) {
        int [] arr={22,34,35,67,68,89,90};
        int target =35;
        int ans= binsearch(arr,34);
        System.out.println(ans);
    }
    static  int binsearch(int []arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end =  mid -1;
            }
            else  if (target > mid) {
                start =  mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}


