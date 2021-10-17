public class P905Sortbyparity {
    class Solution {

        public int[] sortArrayByParity(int[] nums) {
            int even=0; //start form starting
            int i=0;
            int odd=nums.length-1;  //start from ending
            while(i<=odd) //till no odds are left or something like that
            {
                if(nums[i]%2==0)  //check if even or not
                {
                    swap(nums,i,even);  //swap the position as of th even counter
                    i++;                //next element
                    even++;             //next position from the even elemnt to be swapped
                }
                else
                {
                    swap(nums,i,odd); //swap the position as of th odd counter
                    odd--; //prevoius(as we started from back) position from the even element to be swapped
                }
            }

            return nums;

        }
        public void swap(int nums[],int n,int m)
        {
            int temp=nums[n];
            nums[n]=nums[m];
            nums[m]=temp;
        }
    }
}
