package com.Sanket;

//Leetcode problwm number
public class Digitsinmumarray {
    public static void main(String[] args) {
        int[] nums={12,223,432,41,1123};
        System.out.println(findnumbers(nums));

    }
    static int findnumbers(int nums[])
    {
        int count=0;
        for (int num:nums) {
            if(even(num))
                count++;
        }
        return  count;
    }

     static boolean even(int num) {
        int numberoddigits=digits(num);
        if(numberoddigits%2==0)
        {
            return true;
        }
        return false;
    }
    //an  shortcut to find hte nubers of digits
    static  int digits2(int num)
    {
        return (int)Math.log10(num)+1;
    }
     static int digits(int num) {
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while(num>0)
        {
            count++;
            num = num/10;
        }
        return count;
    }

}
