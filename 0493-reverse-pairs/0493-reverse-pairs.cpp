class Solution {
public:
    int cnt;
    void merge(vector<int> &arr,int low,int mid,int high)
    {
        int i = low;
        int j = mid+1;
        while(i <= mid and j <= high)
        {
            if((long)arr[i] >(long) 2*arr[j])
            {
                cnt +=(mid+1 - i);
                j++;
            }
            else
            {
                i++;
            }
            
        }
        
        //now sorting for the conquering
        sort(arr.begin()+low,arr.begin()+high+1);
        return;
        
    }
    void mergeSort(vector<int> &arr,int low,int high)
    {
        if(low == high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);//mid is the n
    }
    int reversePairs(vector<int>& nums) {
        if(nums.empty())
        {
            return 0;
            
        }
        cnt = 0;
        mergeSort(nums,0,nums.size()-1);
        
        return cnt;
    }
};