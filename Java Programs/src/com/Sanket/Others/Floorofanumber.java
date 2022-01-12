package com.Sanket.Others;
// Floor: Greatest number that is <=target

public class Floorofanumber {

    public static void main(String[] args) {
        int arr[]={2,4,12,13,15,23,34,56,76};
        int target=1;
        int index=0;
        index=findingfloor(arr,target);
        System.out.println(arr[index]);
    }
    static  int findingfloor(int []arr, int target)
    {
//        if (target<arr[0])
//        {
//            return -1;
//        }
        int n= arr.length;
        int start=0;
        int end=n-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end= mid-1;
            }
            else if(target>arr[mid])
            {
                start= mid +1;
            }
            else
            {
                return  mid;
            }
        }
        return end;
    }
}

