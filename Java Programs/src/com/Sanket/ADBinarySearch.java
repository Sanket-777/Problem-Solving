package com.Sanket;
//OrderDiagnostic Binary Search
public class ADBinarySearch {
    public static void main(String[] args) {
    int [] arr={9,8,7,6,5,4,3,2,1};
    int [] arr2={1,2,3,4,5,6,7,8,9};

        int target= 7;
    System.out.println(orderAgnosticBS(arr2,target));
    }

    static int orderAgnosticBS(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        //find whether array is in asscending or descending;
        boolean isAsec=arr[start] < arr[end];
        while (start <= end)
        {


            int mid = start + (end - start) / 2;  //advanced formula for optimal solution
           if(target==arr[mid])
           {
               return mid;
           }

           if(isAsec) {
               if (target < arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           }
           else
           {
               if (target > arr[mid]) {
                   end = mid - 1;
               } else  {
                   start = mid + 1;
               }
           }
        }
        return -1;
    }
}
