class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<=nums.length;i++)
        {
            
            for(int j=1;j<=nums.length-1;j++)
            {
                if((nums[i]+nums[j]) == target&& i!=j)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}