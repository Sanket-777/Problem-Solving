package com.Sanket.Others;

import java.util.Scanner;

public class challengeB {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
        {
            int a  =  sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff1 = 0;
            int diff2 = 0;
            if( c > a)
            {
                diff1 = b-a;
                diff2 = c-b;
                if(diff1 == diff2)
                {
                    System.out.println("YES");
                }
                else
                {}

            }
            else
            {
                diff1 = c-b;
                diff2 = a-b;
            }
        }
    }
}
