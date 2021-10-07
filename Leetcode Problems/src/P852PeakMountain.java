class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start < end )
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //we are in the desc phase of the array and this might be the possible solution
                //but the answer can lie in the left of array also thats why end!=mid -1
                end=mid;
            }
            else
            {
                //we are in asc part of array
                //we know that mid+1 element in array in is > mid element
                start=mid+1;
            }
        }
        //in the end when start==end we will get the largest number because of the two checks above
        return start;
    }
}
