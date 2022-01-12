/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int numberofcakes=sc.nextInt();
        long evensum=0;
        long oddsum=0;
        int heightsofcakes[]=new int[numberofcakes];
        for(int i=1;i<=numberofcakes;i++)
        {
            heightsofcakes[i]=sc.nextInt();
            if(i%2==0)
            {
                evensum+=heightsofcakes[i];
            }
            else
            {
                oddsum+=heightsofcakes[i];

            }
        }
        int numberoftasks=sc.nextInt();
        while(numberoftasks-->0)
        {
            int task=sc.nextInt();
            if(task==2)
            {
                System.out.println(oddsum);
            }
            if (task==3)
            {
                System.out.println(evensum);
            }
            if( task==1)
            {
                int l=sc.nextInt();
                int r=sc.nextInt();
                int elemettoadd=sc.nextInt();
                int elementstobechanged= r-l+1;
                if(l%2==0)
                {
                    int even=elementstobechanged/2;
                    int odd=elementstobechanged-even;
                    oddsum+=odd*elemettoadd;
                    evensum+=even*elemettoadd;
                }
                else
                {
                    int od=elementstobechanged/2;
                    int eve=elementstobechanged-od;
                    oddsum+=od*elemettoadd;
                    evensum+=eve*elemettoadd;
                }
            }
        }





    }
}
