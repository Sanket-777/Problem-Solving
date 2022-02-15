package com.Sanket.Codechef;

import java.util.Scanner;

public class p1 {

        public static void main (String[] args) throws Exception
        {
            // your code goes here
            try {


                Scanner sc = new Scanner(System.in);
                int n =  sc.nextInt();
                while(n-- > 0)
                {
                    String str;
                    int chef = 0 ;
                    str = sc.nextLine();
                    int x = sc.nextInt();

                    int carlesen = 0;


                    for(int i = 0; i < str.length();i++)
                    {
                        if(str.charAt(i) == 'C')
                        {
                            carlesen+=2;
                        }
                        if(str.charAt(i) == 'D')
                        {
                            carlesen++;
                            chef++;
                        }
                        if(str.charAt(i) == 'N')
                        {
                            chef+=2;
                        }
                    }

                    if(carlesen == chef)
                    {
                        System.out.println(x * 55);
                    }
                    else{
                        System.out.println(x * 60);
                    }
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        }


}
