package com.Sanket.Subsets;

import java.util.ArrayList;
//Using Recursion
//Every Character has two choices 1.take it 2.ignore it
//till the unpreocessed string is empty .I.e null
//combination
public class AllSubsets {
    public static void main(String[] args) {
       // subseq("","abcd");
//        ArrayList<String> arlist =  new ArrayList<>();
//
//        System.out.println(subseq2("","abcd",arlist));
        System.out.println(subseq3("","xyz"));

    }

    //returning nothing just printing
    static  void  subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //anyone of the below statements can be written first
        subseq(p + ch,up.substring(1));//take it
        subseq(p,up.substring(1));//Ignore  it
    }


    //All the elements in an arraylist in argument
    static ArrayList<String> subseq2(String p, String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        //anyone of the below statements can be written first
        subseq2(p + ch,up.substring(1),list);//take it
        subseq2(p,up.substring(1),list);//Ignore  it
        return list;
    }

    //Arraylist int the Body of the Function
    static ArrayList<String> subseq3(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        //anyone of the below statements can be written first
        ArrayList<String> left  = subseq3(p + ch,up.substring(1));//take it
        ArrayList<String> right = subseq3(p,up.substring(1));//Ignore  it
        right.addAll(left);
        return right;
    }
}
