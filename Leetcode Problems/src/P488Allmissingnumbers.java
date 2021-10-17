import java.util.ArrayList;
import java.util.List;
//Simple cyclic sort and returning the non index matching elements in an list
public class P488Allmissingnumbers {
    //Amazon,Microsoft
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i=0;
            while(i < nums.length)
            {
                int correct = nums[i]-1;
                if( nums[i]!=nums[correct])
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
            for(int j=0;j < nums.length;j++)
            {
                if(nums[j]!=j+1)
                {
                    list.add(j+1);
                }
            }
            return list;
        }
    }
}
