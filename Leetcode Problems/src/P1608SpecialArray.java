public class P1608SpecialArray {
    class Solution {
        public int specialArray(int[] nums) {
            //Arrays.sort(nums);
            int start=0;
            int end = nums.length;
            while(start <= end)
            {
                int mid = start+(end - start)/2;
                int count=findcount(nums,mid);
                if(mid == count)
                {
                    return mid;
                }
                else if(count < mid)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
            return -1;
        }
        public int findcount(int []nums,int t)
        {
            int cnt=0;
            for(int i:nums)
            {
                if(i>=t)
                    cnt++;
            }
            return cnt;
        }
    }
}
