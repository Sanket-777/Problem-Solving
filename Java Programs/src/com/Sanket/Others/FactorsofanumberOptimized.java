package com.Sanket;

public class FactorsofanumberOptimized {
    public static void main(String []args)
    {
        factors2(40);
    }
    //Complexity is order of O(n)
    static void factors1(int n)
    {
        for(int i=1; i <= n; i++)
        {
            if(n % i ==0)
            {
                System.out.print(i+" ");
            }
        }
    }
//only check till the sqrt of n because afte that the elennt will get repeated
    //while checking we should know thaT if there is a condition that
    //factors of 20 are n%2==0 then 2 is a factor but the number that is going to be multiplied by two is also an factor i.e n/2  =  n/i
  // so the factors are i and n/2 where n/i != i
    static void factors2(int n)
    {
        for(int i=1; i <= Math.sqrt(n); i++)
        {
            if(n % i==0)
            { if(n/i == i)
            {
                System.out.print(i+" ");
            }
                System.out.print(i+" "+n/i+" ");
            }
        }
    }
}
