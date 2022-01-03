package com.Sanket.Bitwise;

public class RangeXOR {
    public static void main(String args[])
    {
        //range xor for a,b
        int a=3;
        int b=9;
        int ans = Xor(b) ^ Xor(a-1);  //taking the whole xor(b and then xoring it wiht the the element which we don't want so thth they can be easily removed)
        System.out.print(ans);
        int ans2=0;
        //It can give timelimit exceed for large numbers
        for(int i=a ; i <= b;i++)
        {
            ans2 ^=i;
        }
    }

    static int Xor(int a)
    {
        if(a % 4 == 0 )
        {
            return a;
        }
        if(a % 4 == 1 )
        {
            return 1;
        }
        if(a % 4 == 2 )
        {
            return a+1;
        }

      return 0;
    }
}
