import java.util.Arrays;

public class P976LargestPerimeterTriangle {
    class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            if(nums.length==3 )
            {
                if(nums[nums.length-1]<nums[nums.length-2]+nums[nums.length-3])
                {
                    return (nums[0]+nums[1]+nums[2]);
                }
                else
                {
                    return 0;
                }

            }
            System.out.println(Arrays.toString(nums));
            for(int i=0;i <=nums.length - 3;i++)
            {
                if((nums[nums.length-1-i]<nums[nums.length-2-i]+nums[nums.length-3-i]))
                    return (nums[nums.length-1-i]+nums[nums.length-2-i]+nums[nums.length-3-i]);

            }


            return 0;
        }
        public void insertionsort(int []nums)
        {
            for(int i=0;i<nums.length-1;i++)
            {
                for(int j=i+1;j > 0;j--)
                {
                    if(nums[j-1] > nums[j])
                    {
                        int temp = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = temp;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }
}
