

import java.util.Scanner;

 class ChallengeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int min = 0;
        int max=  0;
        int count = 0;
        while(n-- > 0)
        {
            int noe = sc.nextInt();
            int [] arr = new int[noe];
            for (int i = 0; i < noe; i++) {
                arr[i] = sc.nextInt();
            }
            count = 0;
                min = arr[0];
                for (int i:arr) {
                    if( i < min)
                    {
                        min = i;
                    }
                }
                max = arr[0];
                for (int i:arr) {
                    if( i > max)
                    {
                        max = i;
                    }
                }
               count = max - min;

            System.out.println(count);

         }
    }
}
