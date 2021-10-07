package com.Sanket;

//Simple Binary Search Alogorithm
public class Bsearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int target =1;
        int ans= binsearch(arr,target);
        System.out.println(ans);
    }
    static  int binsearch(int []arr,int target)
    {
        int start = 0;
        int end = arr.length;
        while (start < end)
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
        return -123;
    }
}

