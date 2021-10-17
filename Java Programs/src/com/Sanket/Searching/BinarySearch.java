package com.Sanket;

//Simple Binary Search Alogorithm
//We know in ascending order
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={22,34,35,67,68,89,90};
        int target = 90;
        int ans= binsearch(arr,target);
        System.out.println(ans);
    }
    static  int binsearch(int [] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;  //advanced formula for optimal solution
            if (target < arr[mid]) {
                end =  mid -1;
            }
            else  if (target > arr[mid]) {
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
