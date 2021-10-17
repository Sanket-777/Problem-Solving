public class RoatatedBInarySearch2 {
    //this solution will  work for duplicate values
    public static void main(String[] args) {
        int [] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        System.out.println(search(arr,2));
    }
    static int search(int[] nums,int target)
    {

        int pivot=findpivot(nums);
        System.out.println(pivot);
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
            //it will fail here
            //so solution is here
            if(nums[mid] == nums[start] && nums[mid] == nums[end])
            {
                //check if start is pivot
                if(nums[start] < nums[start+1])
                {
                    return start;
                }
                else
                {
                    start++;
                }
                //check if end is pivot
               if(nums[end-1] > nums[end])
                {
                    return end-1;
                }
               else
               {
                   end--;
               }

            }
            //left side is sorted so pivot should be in right
            //this conditions are for  depend on cases we can say like that
            if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end])
            {
                start =  mid + 1;
            }
            else
            {
                end = mid -1;
            }

        }
        return -1;
    }


}

//Leetcode Solution
/*class Solution {
    public boolean search(int[] nums, int target) {

        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return true;
            }
            else
            {
                return false;
            }
        }



        if(nums[nums.length-1] > nums[0] ||nums[nums.length-1] == nums[0] && nums.length==2 )
        {
            return binarysearch(nums,target,0,nums.length-1);
        }
        int pivot=findpivot(nums);
        if(pivot == -1)
        {
             return binarysearch(nums,target,0,nums.length-1);
        }
        if(target == nums[pivot])
        {
            return true;
        }
       else if (target >= nums[0])  // Case 2
        {
            return binarysearch(nums,target,0,pivot-1); // pivot -1 because we already compared pivot
        }

        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    public boolean binarysearch(int []nums,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target == nums[mid])
            {
                return true;
            }
            else
                if(target > nums[mid])
                {
                    start = mid + 1;
                }
               else
               {
                   end = mid -1;
               }
        }
        return false;
    }
    public int findpivot(int[]nums)
    {
        int start=0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
             if( mid < end  && nums[mid]>nums[mid+1])
             {
                 return mid;
             }
            else if(mid >start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(nums[mid]==nums[start] && nums[mid]==nums[end])
            {
                if(nums[start] > nums[start +1])
                {
                    return start;
                }
                start++;

                if(nums[end] < nums[end-1])
                {
                    return end-1;
                }
                end--;


            }
            else
                if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end]))
                {
                    start = mid +1;
                }
                else
                {
                    end = mid -1;
                }

        }
    return -1;
    }
}*/