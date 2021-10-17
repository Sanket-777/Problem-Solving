public class P888FAircandyswap {
    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int sum1=0;
            int sum2=0;

            for(int n:aliceSizes)
            {
                sum1+=n;
            }
            for(int p:bobSizes)
            {
                sum2+=p;
            }
            int diff=(sum1-sum2)/2;
            // taking the diffmof sum of both the totao candies

            for(int j=aliceSizes.length-1;j>=0;j--)
            {
                for(int i=bobSizes.length-1;i>=0;i--)
                {
                    //checking at which two indices the differences match
                    if(aliceSizes[j]-bobSizes[i]==diff)
                    {
                        return new  int []{aliceSizes[j],bobSizes[i]};
                    }
                }
            }

            return new int []{-1,-1};
        }
    }
}
