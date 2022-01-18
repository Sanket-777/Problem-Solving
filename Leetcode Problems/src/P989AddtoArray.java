import java.util.*;
//Here we have used Linked List Because  the order of elemnts we want in thr list and hte function addFirst helps us.
//        [1,2]
//        Adding 4
//        [4,1,2]
//        Adding 3
//        [3,4,1,2]\
public class P989AddtoArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        addToArrayForm(arr,248);
    }
    static List<Integer> addToArrayForm(int[] num,int k) {

        LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;

        while(len >= 0 || k != 0){

            if(len >= 0){
                k += num[len--];
            }

            result.addFirst(k % 10);
            k /= 10;
        }

        return result;
    }

}

