package com.Sanket.Bitwise;
/*
* */
public class findnonrepeted3 {
    public static void main(String args[])
    {

        int [] arr = {2,2,3,2,7,7,8,8,7,8};
        int total=0;
        int n = 3;
        int lastdigit=0;
        int count1=0;

        while(n > 0)
        {
         //   System.out.print(arr[i]);
            lastdigit = arr[n] & 1;
            n = n << 1;
            if(lastdigit == 1)
            {
                count1++;

            }

        }
        System.out.print(total%n);

    }
}
