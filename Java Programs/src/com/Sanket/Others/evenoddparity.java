package com.Sanket;

import java.util.Arrays;

public class evenoddparity {
    public static void main(String args[])
    {
        int [] nums = {0,1,3,5,2};
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
            {
                int temp=nums[0];
                nums[0]=0;
                nums[i]=temp;
            }
            else
            if(i<nums.length-1 && nums[i]%2!=0 && nums[i+1]%2==0 )
            {

                int swap=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=swap;
                if(nums[i]==0)
                {
                    int temp=nums[0];
                    nums[0]=0;
                    nums[i]=temp;
                }
            }
            else if(i<nums.length-2 && nums[i]%2!=0 && nums[i+2]%2==0 )
            {

                int swap=nums[i];
                nums[i]=nums[i+2];
                nums[i+2]=swap;
                if(nums[i]==0)
                {
                    int temp=nums[0];
                    nums[0]=0;
                    nums[i]=temp;
                }
            }

            if(i<nums.length-1 && nums[i+1] < nums[i] )
            {

                int swap=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=swap;
                if(nums[i]==0)
                {
                    int temp=nums[0];
                    nums[0]=0;
                    nums[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
