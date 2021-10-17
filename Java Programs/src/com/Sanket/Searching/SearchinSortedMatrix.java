package com.Sanket;

public class SearchinSortedMatrix {

    public static void main(String[] args) {
        
    }

    static int [] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while(cStart <= cStart) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
            {
                return new int[] {row,mid};
            }
            else if(matrix[row][mid] < target)
            {
                cStart = mid + 1;
            }
            else
            {
                cEnd = mid - 1;
            }
        }
        return new int []{-1,-1};
    }


     static int []search(int [][]matrix,int target)
     {
         int row=matrix.length;
         int col = matrix[0].length;
         if(row == 1)
         {
             return binarysearch(matrix,0,0,col-1,target);
         }

         int rStart=0;
         int rEnd = row -1;
         int cMid = col/2;
         while(rStart < (rEnd - 1)) // it will search until two rows are find
         {
             int mid = rStart + (rEnd - rStart) / 2;
             if (matrix[mid][cMid] == target)
             {
                 return new int []{mid,cMid};
             }
             else if(matrix[mid][cMid] < target)
             {
                 rStart = mid;
             }
             else
             {
                 rEnd = mid;
             }
         }

         //now i got two rows
         //check  whether target is in the middlw column
         if(matrix[rStart][cMid] == target)
         {
             return new int []{rStart,cMid};
         }
         else if(matrix[rStart+1][cMid] == target)
         {
             return new int []{rStart+1,cMid};
         }
          //search in 1st half
         if(target <= matrix[rStart][cMid-1] )
         {
             return binarysearch(matrix,rStart,0,cMid-1,target);
         }
         else
             //search in 2st half
         if(target <= matrix[rStart][cMid+1] && target <= matrix[rStart][col -1])
         {
             return binarysearch(matrix,rStart,cMid+1,col - 1,target);
         }
         else//search in 3st half

         if(target <= matrix[rStart+1][cMid-1] )
         {
             return binarysearch(matrix,rStart+1,0,cMid-1,target);
         }
         else  //search in 4st half
         {
             return binarysearch(matrix,rStart +1,cMid+1,col - 1,target);
         }

     }
}