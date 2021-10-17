package com.Sanket;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String []args)
    {
        int []arr={-1,0,-2,-4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int []nums)
    {       //run the first loop for (passes)N-1 times
        boolean swapped;
        for(int i=0;i<nums.length;i++)
        {       //second loop for swapping elements with each pass
            swapped = false;
            for(int j=1;j<nums.length-1;j++)
            {
                if(nums[j] < nums[j-1])
                {     //swapping the elements if its is lesser
                    int swap=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=swap;
                    swapped = true;
                }
            }
            if(!swapped)  // this is because if the array is not swapped in any between phases we should stop
                return;
        }
    }
}
