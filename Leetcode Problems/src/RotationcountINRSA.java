public class RotationcountINRSA {
    public static void  main(String []args)
    {
        int [] arr={7, 9, 11, 12, 15};
        int rotatecount=findpivot(arr);
        System.out.println(rotatecount+1);

    }
    static int findpivot(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            else if(mid > start && arr[mid-1] > arr[mid])
            {
                return mid-1;
            }
            else if(arr[start] < arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;
        }
    }

