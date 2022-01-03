package com.Sanket.Recursion;

public class poweroftwo {
    public static void main(String []args) {

        System.out.print(poweroftwo(32,2));
    }

    public static boolean poweroftwo(int n,int i){
        if(2 * i == n)
            return true;


        if(i * i > n)
            return false;

        return poweroftwo(n,i*2);
    }
}
