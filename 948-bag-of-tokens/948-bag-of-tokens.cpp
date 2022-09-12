class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
       sort(tokens.begin(),tokens.end());    
    int t_size = tokens.size(); 
    int i = 0;              
    int score = 0, max_score = 0;
    int spend = t_size-1;       
    
    while(i<=spend){
        
        if(power >= tokens[i]){ 
            score+=1;
            max_score = max(max_score,score); 
            power-=tokens[i];
            i++;
        }
        
        else if(score >= 1){        
            power += tokens[spend];
            score -= 1;
            spend--;
        }
        else
            break;                 
    }
    
    return max_score;
    


    }
};