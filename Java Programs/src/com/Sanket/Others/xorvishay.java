package com.Sanket.Others;

import java.util.Scanner;

public class xorvishay {
    //find the nunber that occurs once
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
        {
            int x = sc.nextInt();
            int k  =1;
            int prev = 0;
            for (int i = 0;i < x ;i++ )
            {
                int  p = i+k;
                if((prev ^ p) != 0)
                {

                    System.out.print(prev+" ");
                    k++;
                    prev = prev ^ p;
                }
                else{
                    i = 0;
                    k++;
                    prev = prev ^ p;
                }
            }
            System.out.println();
        }
        System.out.println(2^4^6);
    }
}
