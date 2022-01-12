package com.Sanket.Others;

public class xorvishay {
    //find the nunber that occurs once
    public static void main(String []args)
    {
        int un=0;
        int [ ]ch = {2,4,2,7,4,1,5,6,1,6,5};
        for(int nums:ch)
        {
            un ^= nums;
        }
        System.out.println(un);
    }
}
