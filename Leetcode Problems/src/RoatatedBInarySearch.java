public class RoatatedBInarySearch {
    //this solution will  not work for duplicate values
    public static void main(String[] args) {
        int [] arr={4,5,6,7,7,0,1,2};
        System.out.println(search(arr,1));
    }
    static int search(int[] nums,int target)
    {
        int pivot=findpivot(nums);
        if(pivot == -1)
        {
            return  BinarySearch(nums,target,0, nums.length-1);
        }
        //Here 3 cases wll be there
        if(target == nums[pivot]) // case 1
        {
            return pivot;
        }
        else if (target >= nums[0])  // Case 2
        {
            return BinarySearch(nums,target,0,pivot-1); // pivot -1 because we already compared pivot
        }

        return BinarySearch(nums,target,pivot+1,nums.length-1); // pivot +1 because we already compared pivot
    }
    static int BinarySearch(int [] nums,int target,int start,int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if (target < nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start= mid+1;
            }
        }
        return -1;
    }
    static  int  findpivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while (start <= end)
        {
            int mid = start +(end - start)/2;
            if(end > mid &&nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(mid > start && nums[mid-1]>nums[mid])
            {
                return mid-1;
            }
            else if (nums[mid] <= nums[start])
            {
                end=mid-1;
            }
            else
            {
                start= mid+1;

            }
        }
        return -1;
    }


}
