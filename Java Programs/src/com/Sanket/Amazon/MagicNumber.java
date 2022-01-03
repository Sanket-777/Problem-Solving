package com.Sanket.Amazon;
/*
Approach using bit manipulations
base =5 n=3 find the nth magic nunber
ith Magic number  Binary
1                    1  5^1         = 5
2                   10  5^2+5^0     = 25
3                   11  5^2+5^1     = 30
4                  100  5^3+5^0+5^0 = 125
5                  101  5^3+5^0+5^1 = 130

(ith)number and base is given
we have to find the ith
taking the binary of ith number like if 5 then ;101
 after anding we get the last nunbershift my n to the right side
 multiply my lastdigit of th
 */

public class MagicNumber {
    public static void main(String args[])
    {
        int n=6;
        int base=5;
        int lastdigit=0;
        int ans=0;
        while(n > 0)
        {
            lastdigit = n & 1;
            System.out.print(n+" ");
            n = n >> 1;
            System.out.println(n);
            ans += lastdigit * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
