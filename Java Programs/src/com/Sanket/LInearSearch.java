package com.Sanket;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LInearSearch {
    public static void main(String[] args) {
        int arr[] ={1,23,1,43,13,4,21,42,12};
        int taarget;
        Scanner on= new Scanner(System.in);
        taarget=on.nextInt();
        System.out.println(Search(arr,taarget));
    }
        static  int Search(int []arr,int taarget)
        {
            int index;
            for ( index = 0; index < arr.length; index++) {
                if(taarget==arr[index])
                {
                    return index;
                }

            }
         return  -1;
        }



    }

