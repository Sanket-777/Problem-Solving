package com.Sanket.Others;

public class isPrime {
    public static void main(String []args)
    {
        int n=53;
        for(int i=2;i <= n;i++)
        {
            if(isPrime(n))
            {
                System.out.print(n+" ");
            }

        }

    }
    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int c = 2;
        while((c * c) <= n)
        {
            if(n % c ==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
}
