class Solution {
public:
    string intToRoman(int num) {
        string s[13] =  {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};
    int n[13] = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};
         string sb ="";
        for(int i = 0 ;i < 13 ;)
        {
            if(num >= n[i])
            {
                sb.append(s[i]);
                num -= n[i];
            }
            else
            {
                i++;
            }
        }
        return sb;
        
    }
};