package com.Sanket.Codechef;

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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int peopleintial = sc.nextInt();
            int arr[] = new int[n];

            for(int i= 0;i < n;i++)
            {
                arr[i] = sc.nextInt();

            }

            int max = peopleintial;
            int max2 = max + arr[0];
            for(int i = 1;i < n;i++)
            {

                max  = Math.max(max,max2);
                max2  = max2 + arr[i];
            }

            System.out.println(max);

        }
    }
}

