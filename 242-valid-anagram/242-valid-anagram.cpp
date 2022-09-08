// class Solution {
// public:
//     bool isAnagram(string s, string t) {
//        int freq[26]={0};
//        int freq2[26]={0};

        
//         for(int i=0;i<t.size();i++){
//             freq[int(t[i])-97]++;
//         }
//         for(int i=0;i<s.size();i++){
//             freq2[int(s[i])-97]++;
//         }
//         for(int i=0;i<26;i++){
//             if(freq[i] != freq2[i])
//             {
//                 return false;
//             }
//         }
//         return true; 
//     }
// };
class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size()!=t.size()) return false;
        
		unordered_map <char, int> umap;
        for (char c:s) umap[c]++;
        for(char c:t) {
            umap[c]--;
            if (umap[c]<0) return false;
        }
        
        return true;
                    
    }
};