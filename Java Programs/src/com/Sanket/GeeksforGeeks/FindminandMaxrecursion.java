package com.Sanket.GeeksforGeeks;

public class FindminandMaxrecursion {

    public static void main(String[] args) {

    }

    static  int findmin(int arr[],int length)
    {
        if(length == 1)
        {
            return arr[0];
        }

        return  Math.min(arr[length-1],findmin(arr,length-1));
    }
}
