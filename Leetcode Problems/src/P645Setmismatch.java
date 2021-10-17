import java.util.ArrayList;
import java.util.List;
// apply Cyclic sort and return the position of the number that is repeated and(the repeated number is itself is placed in the wrong position because  all the other elements are placed in the right place)
public class P645Setmismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i=0;
            while(i < nums.length)
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
                    i++;
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=j+1)
                {
                    return new int[]{nums[j],j+1};
                }
            }
            return new int[] {-1,-1};
        }
    }
}
