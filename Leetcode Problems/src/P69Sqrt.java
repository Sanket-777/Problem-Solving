public class P69Sqrt {
    public static void main(String [] args)
    {
        System.out.println(sqrt(6));
    }

    static int sqrt(int x)
    {
        int start=1;
        int end=x/2;
        while(start<end)
        {
            int mid = start +(end - start)/2;
            if((long)mid*mid==x)
            {
                return mid;
            }
            else if((long)mid*mid < x)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return end;
    }
}
