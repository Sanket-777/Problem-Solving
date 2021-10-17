public class P153MIninuminRSA {
    class Solution {
        public int findMin(int[] nums) {
            int start=0;
            int end=nums.length-1;
            if(nums[nums.length-1]>nums[0])
            {
                return nums[0];
            }
            else if(nums.length==1)
            {
                return nums[0];
            }
            while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(end > mid && nums[mid]>nums[mid+1])
                {
                    return nums[mid+1];
                }
                else
                if(start < mid && nums[mid]<nums[mid-1])
                {
                    return nums[mid];
                }
                else if(nums[mid] > nums[start])
                {
                    start  = mid +1;
                }
                else
                {
                    end = mid -1;
                }

            }
            return -1;
        }
    }
}
