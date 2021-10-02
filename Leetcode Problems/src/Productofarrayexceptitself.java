import java.util.Arrays;

public class Productofarrayexceptitself {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(productExceptSelf(nums));

    }
    static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        ans[0]=1;

        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(ans));
        int multiply=1;
        for(int i=n-2;i>=0;i--){
            System.out.println(multiply);
            multiply*=nums[i+1];
            System.out.println(multiply);
            ans[i]=ans[i]*multiply;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }


}
