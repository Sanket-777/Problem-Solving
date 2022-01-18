package com.Sanket.Recursion.String;
// using  recursion str = baccad anwer  = bccd
// skip a element in string
public class Question1 {
    public static void main(String[] args) {
        skip("","abaabbakbdabkab");
    }
    //processed  string is the anwer and unprocessed is the user String
    static  void skip(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a')
        {
            skip(processed,unprocessed.substring(1));
        }
        else
        {
            skip(processed+ch,unprocessed.substring(1));

        }
    }
}

