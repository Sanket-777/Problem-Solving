package com.Sanket.Backtracking;

public class Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        knights(board,0,0,4);
    }

    static  void knights(boolean [][]board,int row,int cols,int knights)
    {
        //all knights are finished
        if (knights == 0)
        {
            display(board);
            System.out.println();
            return;
        }

        //if the col gets out of bound wiht row
        if(row == board.length -1 && cols == board.length)
        {
            return;
        }
        //at last column of the  current row
        if(cols == board.length)
        {
            knights(board,row+1,0,knights);
            return;
        }
        //safe place to place knight
        if (isSafe(board,row,cols))
        {
            board[row][cols] = true;
            knights(board,row,cols + 1,knights - 1);
            board[row][cols] = false;
        }

        knights(board,row,cols + 1,knights );
    }

    private static boolean isSafe(boolean[][] board, int row, int cols) {
        if(isValid(board,row -2,cols-1))
        {
            if(board[row-2][cols-1])
            {
                return  false;
            }
        }

        if(isValid(board,row-2,cols+1))
        {
            if(board[row-2][cols+1])
            {
                return  false;
            }
        }
        if(isValid(board,row-1,cols+2))
        {
            if(board[row-1][cols+2])
            {
                return  false;
            }
        }
        if(isValid(board,row-1,cols-2))
        {
            if(board[row-1][cols-2])
            {
                return  false;
            }
        }
        return  true;
    }

    static boolean isValid(boolean [][]board,int row,int col)
    {
        if(row >= 0 && row < board.length && col >=0 && col < board.length)
        {
            return  true;
        }
        return  false;
    }

    private static void display(boolean[][] board) {
        for(boolean []row:board)
        {
            for(boolean element:row)
            {
                if (element)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");

                }
            }
            System.out.println();
        }
    }
}
