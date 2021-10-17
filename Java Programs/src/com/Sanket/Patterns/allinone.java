package com.Sanket.Patterns;

public class allinone {
    public static void main(String srgs[])
    {
    pattern31(5);
    }
    static void pattern3(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++ )
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   static void pattern5(int n)
   {
       for(int i=1;i < 2 * n;i++)
       {
           int col = i > n ? n-(i-n):i;
           for(int j=0;j <col;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
   }

   static void pattern6(int n)
   {
       for(int i=1;i < 2 * n;i++ )
       {
           int cols = i > n ? n-(i-n):i;

           int spaces= n-cols;
           for(int k=1;k<=spaces;k++)
           {
               System.out.print(" ");
           }

          for(int j=1;j<=cols;j++)
          {

              System.out.print("* ");
          }
          System.out.println();
       }
   }

   static void pattern30(int n)
   {
       for(int i=1;i<=n;i++)
       {
           int spaces = n-i;
           for(int s=1;s<=spaces;s++)
           {
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--)
           {
               System.out.print(j);
           }
           for(int k=2;k<=i;k++)
           {
               System.out.print(k);
           }
           System.out.println();
       }
   }
    static void pattern31(int n)
    {
        int Originaln = n+1;
        n = 2 * n;
        for(int row=1;row <n;row++)
        {
            for(int col=1;col < n;col++)
            {
                System.out.print(" "+(Originaln-Math.min(Math.min(row,col),(Math.min(n-row,n-col)))));
            }
            System.out.println();
        }
    }
    static void pattern17(int n)
    {
        for(int i=1;i<2 * n;i++)
        {
            int cols  = i > n ? n-(i-n) : i;
            int spaces = n-cols;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=cols;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int k=2;k<=cols;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
