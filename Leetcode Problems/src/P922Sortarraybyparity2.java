public class P922Sortarraybyparity2 {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
                //checking if the number is even and odd anrd placeing it in the the eve odd posoiton i n the new ar
            int n = nums.length;
            int []newarr = new int[n];
            int even = 0;
            int odd = n-1;
            int i=0;
            while(i<=n-1)
            {
                if(nums[i]%2==0)
                {

                    newarr[even] = nums[i];
                    i++;
                    even = even + 2;

                }
                else
                {
                    newarr[odd] = nums[i];
                    i++;
                    odd = odd - 2;
                }
            }
            return newarr;
        }
    }
}
