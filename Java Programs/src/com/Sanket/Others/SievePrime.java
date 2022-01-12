package com.Sanket.Others;

public class SievePrime {
    public static void main(String []args)
    {
        int n=40;
        boolean []primes = new boolean[n+1];//n+1 because it also contains 40
        sieve(n,primes);
    }

    //false in array the number is prime
    static void sieve(int n,boolean [] primes)
    {
        for(int i=2;i*i <= n;i++)
        {
            if(!primes[i])
            {
                for(int j=i*2;j <= n;j+=i)  //i*2 because we start fro the first multiple of it and j+=i because we are fnnding the multipe so +i
                {
                    primes[j] = true;
                }
            }

        }

        for(int k=2;k <= n;k++)
        {
            if(!primes[k])
            {
                System.out.print( k +" ");
            }
        }
    }
}
