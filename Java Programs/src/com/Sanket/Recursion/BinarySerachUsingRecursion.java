package com.Sanket.Recursion;

public class BinarySerachUsingRecursion {
    public static void main(String args[])
    {
            int ch[] = {1,2,4,5,66,77,89,91,92,97};
            int n = 97;
            System.out.print(recursivebinarysearch(ch ,n,0,ch.length - 1 ));
    }

    static int recursivebinarysearch(int [] ch,int n,int start,int end)
    {
        if(start > end){
            return -1;
        }
        int mid = start + ( end - start) / 2;

        if( n == ch[mid] ){
            return mid;
        }

        if(n > ch[mid]){
            return recursivebinarysearch(ch,n,mid + 1,end);
        }

            return recursivebinarysearch(ch,n,start,mid - 1);
    }
}
