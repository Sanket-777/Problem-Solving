package com.Sanket.Sorting;
//Sor
import java.util.Arrays;

public class SelectionSort {
    public static void main(String []args)
    {
        int [] nums={2,5,2,4,8,2,7,2};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void  selectionsort(int []nums)
    {
        for(int i=0;i < nums.length;i++)
        {
            int last = nums.length-i-1; // last index in array at start //i because it will change accordingly
            int MaxIndex=getmaxindex(nums,0,last);
            swaparray(nums,MaxIndex,last);

        }
    }
    static void swaparray(int []nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static int getmaxindex(int []nums,int start,int end)
    {
        int max=start;
        for(int i=start;i <= end;i++)  //<= is necessary because we have to go till end
        {
            if(nums[max] < nums[i])
            {
                max=i;
            }
        }
        return max;
    }
}
