package com.Sanket.Others;

public class Stringandstringbuilder {
    public static void main(String args[])
    {



        String sbb  = "0";
        for(int i = 0;i < 3;i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(sbb);
            sbb += "1" + inverts(String.valueOf(sb.reverse()));

        }

    }
    public static String reverses(String s){
        String  reversedword = null;
        for(int i = s.length() - 1;i > 0;i--)
        {
            reversedword += s.charAt(i);
        }
        return reversedword;
    }
    public static String inverts(String s){
        StringBuilder sc = new StringBuilder();
        for(int  i = 0;i < s.length();i++){
            if(s.charAt(i) == '1')
            {
                sc.append(0);
            }
            else
            {
                sc.append(1);
            }
        }
        return sc.toString();
    }


}
