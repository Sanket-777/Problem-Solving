package com.Sanket.Recursion;
//First uppercase letter in a string (Iterative and Recursive)
public class First_Uppercase_letterinarray {
    public static void main(String args[]){
        String ch = "geeforGeeks";
        System.out.print(first(ch,0));
    }
    static char first(String ch,int n){
        if(n > ch.length()){
            return 0;
        }

        if(Character.isUpperCase(ch.charAt(n))){
            return ch.charAt(n);
        }
        return first(ch,n+1);
    }
}
