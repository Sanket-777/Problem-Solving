import java.util.ArrayList;
import java.util.List;

public class P401Binarywatch {
    class Solution {
        public List<String> readBinaryWatch(int num) {
            List<String> times = new ArrayList<>();
            for(int h=0; h<12; h++)
                for(int m=0; m<60; m++)
                    if((bitCount(h)+bitCount(m))==num)
                        times.add(String.format("%d:%02d", h, m));
            return times;
        }
        public int bitCount(int input){
            int count = 0;
            while(input!=0)
            {
                if((input & 1) == 1)
                {
                    count++;
                }

                input = input >>> 1;
            }

            return count;
        }

    }

}
