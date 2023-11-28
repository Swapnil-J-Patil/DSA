package Backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(path("",3,3));
        boolean[][] map={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[map.length][map[0].length];
        System.out.println(mazeObstacle("",map,0,0));
        System.out.println(mazeObstacleaallpath("",map,0,0));
        System.out.println(mazeObstacleaallpathmatrix("",map,0,0,path,1));
    }
    public static int count(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
    public static List<String> path(String p,int r, int c)
    {
        if(r==1 && c==1)
        {
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(r>1 && c>1)
        {
            ans.addAll(path(p+'D',r-1,c-1));
        }
        if(r>1)
        {
            ans.addAll(path(p +'V',r-1,c));
        }
        if(c>1)
        {
            ans.addAll(path(p+'H',r,c-1));
        }

        return ans;
    }
    public static List<String> mazeObstacle(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)// length of column
        {
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(!maze[r][c])
        {
            return ans;
        }
        if(r<maze.length-1)
        {
            ans.addAll(mazeObstacle(p+'V',maze,r+1,c));
        }
        if(c<maze[0].length-1)
        {
            ans.addAll(mazeObstacle(p+'H',maze,r,c+1));
        }
        return ans;
    }
    public static List<String> mazeObstacleaallpath(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(!maze[r][c])
        {
            return ans;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            ans.addAll(mazeObstacleaallpath(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1)
        {
            ans.addAll(mazeObstacleaallpath(p+'R',maze,r,c+1));
        }
        if(c>0)
        {
            ans.addAll(mazeObstacleaallpath(p+'L',maze,r,c-1));
        }
        if(r>0)
        {
            ans.addAll(mazeObstacleaallpath(p+'U',maze,r-1,c));
        }
        maze[r][c]=true;
        return ans;
    }
    public static List<String> mazeObstacleaallpathmatrix(String p,boolean[][] maze,int r,int c,int[][] matrix,int step)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            matrix[r][c]=step;
            List<String> ans=new ArrayList<>();
            ans.add(p);
            for (int[] i:matrix){
                ans.addAll(Collections.singleton(Arrays.toString(i)));
            }
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(!maze[r][c])
        {
            return ans;
        }
        maze[r][c]=false;
        matrix[r][c]=step;
        if(r<maze.length-1)
        {
            ans.addAll(mazeObstacleaallpathmatrix(p+'D',maze,r+1,c,matrix,step+1));
        }
        if(c<maze[0].length-1)
        {
            ans.addAll(mazeObstacleaallpathmatrix(p+'R',maze,r,c+1,matrix,step+1));
        }
        if(c>0)
        {
            ans.addAll(mazeObstacleaallpathmatrix(p+'L',maze,r,c-1,matrix,step+1));
        }
        if(r>0)
        {
            ans.addAll(mazeObstacleaallpathmatrix(p+'U',maze,r-1,c,matrix,step+1));
        }
        maze[r][c]=true;
        matrix[r][c]=0;
        return ans;
    }
}
