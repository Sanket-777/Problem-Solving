//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{

  public:
    
	int minDifference(int arr[], int n)  { 
	    // Your code goes here
	    int sum = 0;
	    for(int i = 0;i < n;i++)
	    {
	        sum += arr[i];
	    }
	    vector<vector<bool>> dp(n + 1 , vector<bool>(sum / 2 + 1 , false));
    for (int i = 0 ; i < n + 1 ; i++) {
        dp[i][0] = true;
    }

    for (int i = 1 ; i < n + 1 ; i++) {
        for (int j = 1 ; j < sum / 2 + 1; j++) {
            if (arr[i - 1] <= j) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    int mx = -1;
    for (int j = 0 ; j < sum / 2 + 1 ; j++) {
        if (dp[n][j] == true)
            mx = j;
    }

    return  sum - 2 * mx ;;
	 
	    
	    
	    
	    
	} 
};


//{ Driver Code Starts.
int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int a[n];
        for(int i = 0; i < n; i++)
        	cin >> a[i];

       

	    Solution ob;
	    cout << ob.minDifference(a, n) << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends