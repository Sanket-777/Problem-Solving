package com.Sanket.Others;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] ch={'c','f','j'};
        char targert='a';
        System.out.println(findceiling(ch,targert));

    }
    static  char  findceiling(char []letters,int target)
    {
        int start=0;
        int end=letters.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                end= mid-1;
            }
            else
            {
                start= mid +1;
            }

        }
        return letters[start%letters.length];

    }
}
