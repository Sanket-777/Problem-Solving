class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int r = board.size();
        int c = board[0].size();
        
        unordered_set<string> S;
        
        for(int i = 0; i < r;i++)
        {
            for(int j = 0; j < c;j++)
            {
                if(board[i][j] == '.')
                    continue;
                
                string ch(1,board[i][j]);
                string row = "("+to_string(i)+")"+ch;
                string col = ch+"("+to_string(j)+")";
                string box = "("+to_string(i/3)+ch+to_string(j/3)+")";
                
                if(S.find(row)!=S.end() || S.find(col)!=S.end()||S.find(box)!=S.end())
                {
                    return false;
                }
                else
                {
                    S.insert(row);
                    S.insert(col);
                    S.insert(box);
                }
            }
        }
        return true;
    }
};