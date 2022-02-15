package com.Sanket.Amazon;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
       // dice("",5);
        System.out.println(dice2("",4));
    }
    //ways to recieve a target number
    static void dice(String p,int digit)
    {
        if(digit == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 &&  i <= digit ; i++) {
            dice(p + i,digit - i);
        }
    }
    //number of ways to recieve target number
    static int dicecount(String p,int digit)
    {
        if(digit == 0)
        {

            return 1;
        }
        int count  = 0;
        for (int i = 1; i <= 6 &&  i <= digit ; i++) {
             count = count +dicecount(p + i,digit - i);
        }
        return count;
    }
    //returning as a list
    static List<String> dice2(String p, int digit)
    {
        if(digit == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        int count  = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 &&  i <= digit ; i++) {
            ans.addAll(dice2(p + i,digit - i));
        }
        return ans;
    }

}
