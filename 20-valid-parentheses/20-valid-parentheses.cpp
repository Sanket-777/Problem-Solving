class Solution {
public:
    bool isValid(string s) {
        int cnt= 0;
        bool flag = true;
        stack<char>par;
        
        for(int i = 0;i < s.length();i++)
        {
            if(s.at(i) == '(' || s.at(i) == '['  || s.at(i) == '{')
            {
                par.push(s.at(i));
            }
            else if(par.empty())
            {
                return false;
            }
                if(s.at(i) ==')')
            {
                if(par.top()=='(')
                {
                    par.pop();         
                }
                else  
                {   return false;
                }
            }
             else if(s.at(i) ==']')
            {
                if(par.top()=='[')
                {
                     par.pop();
                }
                else
                {

                     return false;
                }
            }
             else if(s.at(i) =='}')
            {
                if(par.top()=='{')
                {
                     par.pop();

                }
                else
                {
                     return false;
                }
            }

        }
       
     if(par.empty())
         return true;
    return false;
    }
};