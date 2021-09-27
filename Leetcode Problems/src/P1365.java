public class P1365 {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int n = nums.length;
            int answer[]= new int[n];
            int count=0;
            for (int i = 0; i < n; i++) {
                count=0;
                for (int j = 0; j < n; j++) {
                    if(nums[i]>nums[j] && i!=j)
                    {
                        count++;
                    }
                    answer[i]=count;



                }

            }
            return  answer;
        }
    }
}
