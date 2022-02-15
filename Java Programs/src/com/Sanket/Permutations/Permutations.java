package com.Sanket.Permutations;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args)
    {
      permutations("","abc");

       // System.out.println(permutationscount("","abc"));
    }

    //returning as array list
    static ArrayList<String> permutationsList(String p, String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

        char ch  = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+l,up.substring(1)));
            //f+ch+l refer the tree and up.substring is to skip the character one by one

        }
        return ans;
    }
    //just simply printing
    static  void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch  = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutations(f+ch+l,up.substring(1));
            //f+ch+l refer the tree and up.substring is to skip the character one by one

        }
    }
    //counting the number of permutations
    static  int permutationscount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }

        char ch  = up.charAt(0);
        int count = 0;
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
             count += permutationscount(f+ch+l,up.substring(1));
            //f+ch+l refer the tree and up.substring is to skip the character one by one

        }
        return count;
    }
}
