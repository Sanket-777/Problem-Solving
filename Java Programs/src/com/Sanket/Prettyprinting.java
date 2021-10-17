package com.Sanket;

public class Prettyprinting {
    public static void main(String []args)
    {
//        float b = 423.34234123f;  // floating point literal
//        System.out.println('a'+2);
//        System.out.printf("Hello my name is %s and i am %s","Sanket","cool");
        String alpha = "";
        for(int i=0;i<26;i++)
        {
            char ch = (char)('a' + i);
            alpha = alpha+" "+ch;
          // new object is created all the time
            //25 objects will be wasted        }
        System.out.println(alpha);
    }

}}
