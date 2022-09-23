class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        vector<int> v;
        int an = 0;
        int n = points.size();
        for(int i = 0; i < n;i++)
        {
            v.push_back(points[i][0]);
        }
        sort(v.begin(),v.end());
        for(int j  =1;j < n;j++)
        {
            if(v[j]-v[j-1] > an)
            {
                an = v[j]-v[j-1];
            }
        }
        return an;
    }
};