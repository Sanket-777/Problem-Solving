public class P476Complimentofanumber {
    class Solution {
        public int findComplement(int num) {
            int bits = numberofbits(num);   //couting the number of bits in that number
            System.out.println(bits);

            int n = (1 << bits) -1;  //taking a mask value like 11 or 1111 so that byv oring it with nuber we will get the compliment
            System.out.println(n);
            return num ^ n;
        }

        public int numberofbits(int num)
        {
            int count=0;
            while(num != 0)
            {
                num = num >> 1;
                count++;
            }
            return count;
        }
    }
}
