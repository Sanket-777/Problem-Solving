class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int start =  0 ;
        int end  = arr.length - 1;
        while((end - start) >= k)
        {
          int   dstart  = Math.abs(arr[start] - x);
          int   dend = Math.abs(arr[end] - x);
            
            
            if(dstart <= dend)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        
        while(start <= end)
        {
            list.add(arr[start++]);
        }
     return list;
    }
}