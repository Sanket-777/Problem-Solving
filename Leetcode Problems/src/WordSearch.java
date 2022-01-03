public class WordSearch {
    public static void main(String args[]){
                char arr [][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
                String word = "ABCB";
                System.out.print(exist(arr,word));
    }
    public static boolean exist(char[][] board, String word) {
        for(int i = 0;i < board.length ; i++){
            for(int j = 0; j < board[0].length ;j++)
            {
                if(board[i][j] == word.charAt(0) && findanswer(board,word,i,j,0))
                    return true;
            }

        }
        return false;
    }

    public static  boolean findanswer(char [][] b,String word,int r,int c,int pos){
        if(word.length() == pos )
            return true;

        if( r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] == '0'|| b[r][c] != word.charAt(pos))
            return false;

        char temp = b[r][c];
        b[r][c] = '0';
        if(        findanswer(b,word,r + 1,c,pos + 1)
                || findanswer(b,word,r - 1,c,pos + 1)
                || findanswer(b,word,r,c + 1,pos + 1)
                || findanswer(b,word,r ,c- 1,pos + 1))
        {
            return true;
        }

        b[r][c]  = temp;

        return false;

    }
}
