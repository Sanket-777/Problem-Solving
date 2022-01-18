import java.util.List;

public class P1773Countsitems {
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int index=0;
            if(ruleKey.equals("color"))
            {
                index=1;
            }
            else if(ruleKey.equals("name"))
            {
                index=2;
            }
            int count=0;
            for(int j=0;j<items.size();j++)
            {
                if(index==0 && ruleValue.equals(items.get(j).get(0)))
                {
                    count++;
                }
                else if(index==1 && ruleValue.equals(items.get(j).get(1)))
                {
                    count++;
                }
                else if(index==2 && ruleValue.equals(items.get(j).get(2)))
                {
                    count++;
                }
            }
            return count;
        }
    }
}
