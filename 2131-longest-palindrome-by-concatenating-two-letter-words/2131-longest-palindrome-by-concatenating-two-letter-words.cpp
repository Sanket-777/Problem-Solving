class Solution {
public:
    int longestPalindrome(vector<string>& words) {
    unordered_map<string, int> m;
    int unpaired = 0, ans = 0;
    for (string w: words) {
        if (w[0] == w[1]) {     //checking if both the letters are same or not
            if (m[w] > 0) {    // checking if the  we found multipe count of same words
                unpaired--;     // we found a matching word so --
                m[w]--;        //removing that word from the map
                ans += 4;       //when we get two letters the cnt becomes 4 so we add 4 to them
            }
            else {
                m[w]++;     
                                //if it is not present in map add it in map
                unpaired++;     //mark it as unpaired
            }
        }
        else {
            string rev = w;   //letters are not equal
            reverse(rev.begin(), rev.end());
            if (m[rev] > 0) {
                ans += 4;
                m[rev]--;
            }
            else 
            {
                    m[w]++;
            }
        }
    }
    if (unpaired > 0) ans += 2;
    return ans;
}
};