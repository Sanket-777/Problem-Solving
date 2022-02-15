package com.Sanket.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    public static void main(String[] args) {
     //   System.out.println(countnumberofpaths(3,3));
 //    typesofpaths("",3,3);
      //  System.out.println(typesofpathsArray2("",3,3));
        //place false at the
        boolean [][] maze = {
                {true,true,true},
                {false,true,true},
                {true,true,true}
        };
        PathwithRestriction("",maze,0,0);

    }
    //function for the number of paths
    static int countnumberofpaths(int r,int c)
    {
        if(r==1 || c == 1)
        {
            return  1;
        }

        int left = countnumberofpaths(r-1,c);
        int right = countnumberofpaths(r,c-1);
        return  left+right;
    }
    //functin for printing the paths
    static void typesofpaths(String p, int r, int c)
    {
        if(r==1 && c == 1)
        {
            System.out.println(p);
            return ;
        }
        if(r > 1)
        {
            typesofpaths(p+'D',r-1,c);
        }
        if(c > 1)
        {
            typesofpaths(p+'R',r,c-1);
        }
    }

    //function for printing the paths using array list
    static List<String> typesofpathsArray(String p, int r, int c)
    {
        if(r==1 && c == 1)
        {
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String>  ans = new ArrayList<>();
        if(r > 1)
        {
            ans.addAll(typesofpathsArray(p+'D',r-1,c));
        }
        if(c > 1)
        {
            ans.addAll(typesofpathsArray(p+'R',r,c-1));
        }
        return ans;
    }

    //also includes diagonal direction
    static List<String> typesofpathsArray2(String p, int r, int c)
    {
        if(r==1 && c == 1)
        {
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String>  ans = new ArrayList<>();
        if(r > 1 && c > 1)
        {
            ans.addAll(typesofpathsArray2(p+'D',r-1,c-1));
        }
        if(r > 1)
        {
            ans.addAll(typesofpathsArray2(p+'V',r-1,c));
        }
        if(c > 1)
        {
            ans.addAll(typesofpathsArray2(p+'H',r,c-1));
        }
        return ans;
    }


    //Path with ristriction the the position of the false boolean array
    static void  PathwithRestriction(String p,boolean [][]maze, int r, int c)
    {
        if(r== maze.length -1 && c == maze[0].length -1)
        {
            System.out.println(p);
            return  ;
        }
        ArrayList<String>  ans = new ArrayList<>();
        if (!maze[r][c]) {
            return  ;
        }
        if(r < maze.length -1)
        {
            PathwithRestriction(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length -1)
        {
            PathwithRestriction(p+'R',maze,r,c+1);
        }
        return ;
    }
}
