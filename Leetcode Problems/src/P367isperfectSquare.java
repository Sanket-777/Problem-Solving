public class P367isperfectSquare {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int start=1;
            int end =num/2;
            if(num == 1)
                return true;
            while(start <=  end)
            {
                int mid = start + (end - start)/2;
                if((long)mid * mid == num)
                {
                    return true;
                }
                else if((long)mid * mid < num)
                {
                    start = mid +1;
                }
                else
                {
                    end = mid -1;
                }
            }
            return false;
        }
    }
}
