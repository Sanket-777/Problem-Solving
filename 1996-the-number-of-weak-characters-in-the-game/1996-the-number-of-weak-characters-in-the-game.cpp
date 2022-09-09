class Solution {
public:
    bool static sorted(vector<int> &a,vector<int> &b)
    {
        if(a[0]==b[0])
        {
            return a[1]>b[1]; // if the a[0] == b[0] then bigger first smaller last
        }
        return  a[0]<b[0];//here smaller first ,bigger last
    }
    int numberOfWeakCharacters(vector<vector<int>>& p) {
        int ans  = 0 ;
        int maxd = INT_MIN;
        int n = p.size();
        sort(p.begin(),p.end(),sorted); //used sorted to edit sort function
        for(int i = n-1;i >=0 ; i--)
        {
            if(p[i][1]<maxd)
                ans++;
            if(p[i][1]>maxd)
                maxd=p[i][1];
        }
        return ans;
    }
};