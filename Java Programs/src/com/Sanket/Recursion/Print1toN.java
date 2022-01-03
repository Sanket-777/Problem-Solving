package com.Sanket.Recursion;

public class Print1toN {
    public static void main(String args[]){
        printNos(10);
    }
    public static void printNos(int N)
    {
        if(N > 0)//The loop runs till N>1
        {
            printNos(N-1);//We keep on recursing till the end as we want to pritn from 1 to N
            System.out.print(N+" ");//When recursion is done then print N
        }
        return;
    }
}
