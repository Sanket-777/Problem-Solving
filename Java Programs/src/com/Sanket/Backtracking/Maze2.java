package com.Sanket.Backtracking;


import java.util.Arrays;

public class Maze2 {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] arr = new int[maze.length][maze[0].length];
        PathwithRestrictionalldirection2("",maze,0,0,arr,1);
    }


    //in all directions
    static void  PathwithRestrictionalldirection(String p,boolean [][]maze, int r, int c)
    {
        if(r== maze.length -1 && c == maze[0].length -1)
        {
            System.out.println(p);
            return  ;
        }

        //checking if the box is visited or not
        if (!maze[r][c]) {
            return  ;
        }

        maze[r][c] = false;
        //making the box visited
        if(r < maze.length -1)
        {
            PathwithRestrictionalldirection(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length -1)
        {
            PathwithRestrictionalldirection(p+'R',maze,r,c+1);
        }

        if(r > 0)
        {
            PathwithRestrictionalldirection(p+"U",maze,r-1,c);
        }

        if(c > 0)
        {
            PathwithRestrictionalldirection(p+"L",maze,r,c - 1);
        }

        //again making the box un-visited  for the above recursion calls
        maze[r][c] = true;
        //This can be known as Backtracking
        return ;
    }
    //Also Printintg the path with step number
    static void  PathwithRestrictionalldirection2(String p,boolean [][]maze, int r, int c,int [][] arr,int step)
    {
        if(r== maze.length -1 && c == maze[0].length -1)
        {
            arr[r][c] = step;
            for (int []ar:arr) {
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(p);
            return  ;
        }

        //checking if the box is visited or not
        if (!maze[r][c]) {
            return  ;
        }

        maze[r][c] = false;
        arr[r][c] = step;
        //making the box visited
        if(r < maze.length -1)
        {
            PathwithRestrictionalldirection2(p+'D',maze,r+1,c,arr,step+1);
        }
        if(c < maze[0].length -1)
        {
            PathwithRestrictionalldirection2(p+'R',maze,r,c+1,arr,step+1);
        }

        if(r > 0)
        {
            PathwithRestrictionalldirection2(p+"U",maze,r-1,c,arr,step+1);
        }

        if(c > 0)
        {
            PathwithRestrictionalldirection2(p+"L",maze,r,c - 1,arr,step+1);
        }

        //again making the box un-visited  for the above recursion calls
        maze[r][c] = true;
        arr[r][c] = 0;
        //This can be known as Backtracking
        return ;
    }
}
