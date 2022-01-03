package com.Sanket.Recursion;

public class LinearRecursion {

    public static void main(String[] args) {
        int arr[] = {1,2,4,324,53,56,32,44,3,22,43};
        System.out.println(linearsearch(arr,57,0));
    }

    static boolean linearsearch(int arr[],int target,int index)
    {
        if(index == arr.length )
        {
            return  false;

        }

        return  arr[index] == target || linearsearch(arr,target,index + 1);
    }
}
