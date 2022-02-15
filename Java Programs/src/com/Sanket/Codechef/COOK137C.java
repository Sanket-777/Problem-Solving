package com.Sanket.Codechef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class COOK137C
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        while(n-- > 0)
        {
            int len = sc.nextInt();
            int sumall = 0;
            int arr[] = new int [len];
            for(int i = 0; i < len ;i++)
            {
                arr[i] =  sc.nextInt();
                sumall =  sumall + arr[i];
            }
            int meanvalue = 0;
            int mean1 = 0;
            int mean2 = 0;
            float highest  = Integer.MIN_VALUE;
            for(int j = 0; j < arr.length-1;j++)
            {

                meanvalue = (meanvalue + arr[j]);
                mean1 = ((mean1 + arr[j])/(j+1));
                mean2 = (sumall - meanvalue)/(arr.length - (j+1));
                if((mean1+mean2) > highest)
                {
                    highest = mean1+mean2;
                }
            }
            System.out.println(highest);
        }
    }
}
