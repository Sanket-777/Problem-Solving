public class GuessGameSolution  {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        if(n == 1)
            return 1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            int num = guess(mid);
            if(num == 0)
            {
                return mid;
            }
            else if(num == -1)
            {
                end = mid - 1;
            }
            else
            {
                start = mid +1;
            }
        }
        return start;
    }
//this function is just written for timepass it is inbuilt in leetcode
    private int guess(int mid) {
        mid=mid+1;
        return mid;
    }
}
