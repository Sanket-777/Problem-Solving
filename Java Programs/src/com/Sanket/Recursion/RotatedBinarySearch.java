package com.Sanket.Recursion;
//searching in a rotated binary search
public class RotatedBinarySearch {
    public static void main(String[] args) {
    int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,1,0, arr.length-1));
    }
    static int search(int arr[],int target,int start,int end)
    {
        if( start > end){
            return  -1;
        }

        int mid = start + (end - start) / 2;
        if( arr[mid] == target)
        {
            return  mid;
        }
        //if the first half is sorted
        if(arr[start] <= arr[mid])
        {
            //if the element lies here
            if (target > arr[start] && target <= arr[mid])
            {
                //end will be changed to mid - 1
                return  search(arr, target, start, mid-1);
            }
            else
            {
                return  search(arr, target, mid+1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end])
        {
            return  search(arr, target, mid+1, end);
        }
        return  search(arr, target, start, mid - 1);
    }
}
