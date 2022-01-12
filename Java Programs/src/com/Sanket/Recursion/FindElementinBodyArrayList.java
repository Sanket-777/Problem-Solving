package com.Sanket.Recursion;

import java.util.ArrayList;

//not taking arraylist in outside the function
//not taking the arraylist in the argument list
public class FindElementinBodyArrayList {
    public static void main(String[] args) {


        int arr[]=  {1,2,3,4,5,6,7,5,3,6};
        System.out.println(findelement(arr,5,0));
    }

    static ArrayList<Integer> findelement(int arr[],int target,int index)
    {

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
        {
            return  list;

        }

        if (arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> answersfrombelowcalls = findelement(arr,target,index+1);

        list.addAll(answersfrombelowcalls);

        return list;
    }
}
