import java.util.ArrayList;
import java.util.List;
//Amazon
//simple cyclic sort and then returning number at the wrong position
public class P442Findallduplicatesrepeated {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
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
                    list.add(nums[j]);
                }
            }
            return list;
        }


    }
}
