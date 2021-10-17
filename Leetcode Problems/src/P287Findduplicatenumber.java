
//Amazon ,Microsoft
//Cyclic sort with checking numbervat correct position
public class P287Findduplicatenumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i=0;
            while(i < nums.length)
            {

                if(nums[i]!=i+1)
                {
                    int correct = nums[i]-1;
                    if(nums[i]!=nums[correct])
                    {
                        int temp = nums[i];
                        nums[i] = nums[correct];
                        nums[correct] = temp;
                    }
                    else
                    {
                        return nums[i];
                    }
                }
                else
                {
                    i++;
                }


            }
            return -1;
        }

    }
}
