package com.Sanket.Sorting;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String []args)
    {
        int [] nums = {3,5,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int nums[])
    {
        int i=0;
        while(i < nums.length)
        {
            int correctindex=nums[i]-1;
            if(nums[i] != nums[correctindex])
            {
                int temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex] = temp;
            }
            else
            {
                i++;
            }
        }

    }
}
