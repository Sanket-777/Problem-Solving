import java.util.Arrays;

public class Productofarrayexpectitself2 {
    public static void main(String[] args) {
        int [] nums={-1,1,0,-3,3};
        System.out.println(productExceptSelf(nums));

    }

    static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []products= new int[n];

        int product2=0;
        int index=0;
        for (int j = 0; j < n; ) {
            index=j;
            int[] newarr = new int[n - 1];
            for (int i = 0, k = 0; i < n; i++) {

                if (i == index) {
                    continue;
                }
                newarr[k++] = nums[i];

            }
            product2=findrpoduct(newarr, n);
            System.out.println(product2);
            products[j++]=product2;
            product2=0;

        }
        System.out.println(Arrays.toString(products));
      return  products;
    }

     static int findrpoduct(int[] newarr,int n) {
         int product = 1;
         for (int i = 0; i < n-1; i++) {
             product = product * newarr[i];
         }
         return product;
    }


}
/*
* class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n=nums.length;
        int []products= new int[n];

        int product2=0;
        int index=0;
        for (int j = 0; j < n; ) {
            index=j;
            int[] newarr = new int[n - 1];
            for (int i = 0, k = 0; i < n; i++) {

                if (i == index) {
                    continue;
                }
                newarr[k++] = nums[i];

            }
            product2=findrpoduct(newarr, n);
            products[j++]=product2;
            product2=0;
        }

      return  products;
    }
    public int findrpoduct(int[] newarr,int n) {
         int product = 1;
         for (int i = 0; i < n-1; i++) {
             product = product * newarr[i];
         }
         return product;
    }

}*/

