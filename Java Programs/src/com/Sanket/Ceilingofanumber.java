package com.Sanket;
//Ceiling of a  number is smallest element in array greater than or equal to target
public class Ceilingofanumber {

    public static void main(String[] args) {
        int arr[]={2,4,12,13,15,23,34,56,70};
        int target=33;
        int index=findceiling(arr,target);
        System.out.println(arr[index]);
    }
    //but what if target is largest number
    static  int  findceiling(int []arr,int target)
    {
        if (target > arr[arr.length-1]) {
            return -1;
            }

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
        return start;
    }
}
