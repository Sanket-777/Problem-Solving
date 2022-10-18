class Solution {
public:
    void nextPermutation(vector<int>& p) {
        int n  = p.size(),k,l;
  for(k = n-2;k>=0;k--)
  {
      if(p[k]<p[k+1]) //arr[i] < arr[i+1]
          break;
  }
    
    if(k < 0)
    {
        reverse(p.begin(),p.end()); //best case is not inflation point
    }
    else
    {
        for(l = n-1;l > 0;l--)
        {
            if(p[l]>p[k])
            {                               
                break;
            }
        }
        swap(p[k],p[l]);
        reverse(p.begin()+k+1,p.end()); 
    }
    }
}; 