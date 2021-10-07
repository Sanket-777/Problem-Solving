public class Searchininfinitearray {
    public static void main(String[] args) {
       int [] nums={1,2,3,4,5,11,22,33,44,55,66,77,123,124,145,167,178,190,234,345,389};
       int target=33;
        System.out.println(findrange(nums,target));

    }
    static  int findrange(int [] nums,int target)
    {
        int start=0;
        int end =1;
        while (target > nums [end])
        {
            int newstart = end +1;
            //new start is the end of the previous chunk
            //because we want the value of start to be updated  after the formula we need it in the formula
            end = end +(end - start +1) * 2;
            start = newstart;
            // plus 1 is necessary in this formula
        }
        return BinarySearch(nums,target,start,end);
    }
    static int BinarySearch(int [] nums,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < nums[mid])
            {
                end = mid-1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
       return  -1;
    }

}
