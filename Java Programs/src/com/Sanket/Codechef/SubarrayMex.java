package com.Sanket.Codechef;

import java.util.Scanner;

public class SubarrayMex {
    public static void main(String[] args) {
        /* package codechef; // don't place package name! */


                // your code goes here
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-- > 0)
                {
                    int n = sc.nextInt();
                    int k = sc.nextInt();
                    int x = sc.nextInt(); //mex
                    int p = 0;
                    if(x <= k && x > 0)
                    {
                        int [] arr = new int[n];
                        int i  = 0;
                        while(p < x && i < n)
                        {
                            arr[i] = p;
                            i++;
                            p++;
                        }
                        while(i < n)
                        {
                            arr[i++] = p;
                        }
                        for(int z :arr)
                        {
                            System.out.print(n+" ");
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println(-1);
                    }



                }
            }
        }

