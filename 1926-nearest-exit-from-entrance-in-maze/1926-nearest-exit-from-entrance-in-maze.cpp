class Solution {
public:
    int nearestExit(vector<vector<char>>& m, vector<int>& e) {
        int mx = m.size()-1;
        int ny = m[0].size()-1;


        queue<tuple<int,int,int>> q;
        q.push({e[0],e[1],0}); //pushing the iniial entrance into the tuple of queue

        while(!q.empty())    //check for all possiblities until queue is empty
        {                     //because we will enter into the queue only if therer is a way
            auto [currx,curry,step] = q.front(); // getting the value from the queue;
            q.pop();                              //removing it form the as we are trying that path

            if(m[currx][curry] == '+') //checking  if there is a wall
            {
                continue; // if yes then skip the loop
            }

            m[currx][curry] = '+'; // making the current path as wall(marking it as visited as we have already gone through this path)

            if(currx == 0 || currx == mx || curry == 0 || curry == ny)  //checking if we are at the boundry of the wall
            {
                if(currx == e[0] && curry == e[1]);  //checking if we are not at the enntrance
                else{
                    return step; //we had found our answer
                }
            }
                
            step++;  //we are not at the boundry adding our step
           
            if(curry != ny &&  m[currx][curry+1] == '.')q.push({currx,curry+1,step}); //there is a path add it to queue
            if(currx  && m[currx-1][curry] == '.')      q.push({currx-1,curry,step});//there is a path add it to queue
            if(currx != mx && m[currx+1][curry] == '.') q.push({currx+1,curry,step});//there is a path add it to queue
            if(curry  && m[currx][curry-1] == '.')      q.push({currx,curry-1,step});//there is a path add it to queue
                
            
        }

        return -1; //if there is not such path to exit return -1 ;
        
    }
};