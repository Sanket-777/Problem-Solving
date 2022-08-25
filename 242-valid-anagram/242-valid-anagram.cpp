class Solution {
public:
    bool isAnagram(string s, string t) {
       int freq[26]={0};
       int freq2[26]={0};

        
        for(int i=0;i<t.size();i++){
            freq[int(t[i])-97]++;
        }
        for(int i=0;i<s.size();i++){
            freq2[int(s[i])-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != freq2[i])
            {
                return false;
            }
        }
        return true; 
    }
};