package com.Sanket.Bitwise;

public class powerbase {
    public static void main(String []args)
    {
        int base = 3;
        int power = 2;

        int ans = 1;
        while(power > 0)
        {
            if((power & 1) == 1)
            {
                ans *= base;
            }            base *= base;
            power  = power >> 1;
        }

        System.out.println(ans);
    }
}
