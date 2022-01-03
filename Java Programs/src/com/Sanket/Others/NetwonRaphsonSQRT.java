package com.Sanket;

public class NetwonRaphsonSQRT {
    public static void main(String []argd)
    {
        System.out.printf("%.3f",sqrt(40));
    }
    static double sqrt(int n)
    {
        double x=n;
        double root;
        while(true)
        {
            root = 0.5 * (x + (n/x));

            if(Math.abs(root-x)  < 0.5)
            {
                break;
            }

            x = root;
        }
        return root;
    }
}
