package com.Sanket.Recursion.String;
// Same question as 1 but hereeeee we are solving in a different approach
//here we are solving it in a tree likw form -> -> like this ,And only taking one argument
//Also the second function is to skip an entire string e.g apple
public class Question2 {
    public static void main(String[] args) {
        System.out.println(skipapple("hehasagoogappleinhishand"));
    }
    //processed  string is the answer and unprocessed is the user String
    static  String skip(String processed)
    {
        if(processed.isEmpty())
        {
            System.out.println(processed);
            return "";
        }

        char ch = processed.charAt(0);

        if(ch == 'a')
        {
           return skip(processed.substring(1));
        }
        else
        {
            return ch + skip(processed.substring(1));

        }
    }

    static  String skipapple(String processed)
    {
        if(processed.isEmpty())
        {
            System.out.println(processed);
            return "";
        }


        if(processed.startsWith("apple"))
        {
            return skipapple(processed.substring(5));
        }
        else
        {
            return  processed.charAt(0) + skipapple(processed.substring(1));
        }
    }
}
