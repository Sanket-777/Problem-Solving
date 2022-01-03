package com.Sanket.Recursion;

public class Productoftwonumbers {
    public static void main(String []args){
        System.out.print(Productoftwo(7,5));
    }
    static int Productoftwo(int x,int y){
        if(x > y)
            return Productoftwo(y,x);

        if(x == 0)
            return 0;

        return y+Productoftwo(x-1,y);
    }
}
