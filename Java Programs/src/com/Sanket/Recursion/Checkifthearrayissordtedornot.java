package com.Sanket.Recursion;

public class Checkifthearrayissordtedornot {
    public static void main(String []args){
        int [] ch = {1,2,3,4,8,6,7,8};

        System.out.print(Sortedornot(ch,ch.length-1));
    }
    static boolean Sortedornot(int [] ch,int n){
        if(n == 1)
            return true;

        if(ch[n] < ch[n - 1])
            return false;

        return Sortedornot(ch,n - 1);
    }
}
