package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queen(board,0));
        System.out.println(nqueen(board,0));
    }
    public static int queen(boolean[][] board,int row)
    {
        if(row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //checking for every row and column
        for (int col = 0; col < board.length; col++) {
             if(isSafe(board,row,col))
             {
                 //place the queen if it is safe
                 board[row][col]=true;
                 count+=queen(board,row+1);
                 board[row][col]=false;
             }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //for checking vertically row
        for (int i = 0; i < row; i++) {
           if(board[i][col])
           {
               return false;
           }
        }

        //for left diagonal
        int maxLeft=Math.min(row,col); //this is for walls
        for (int i = 1; i <=maxLeft ; i++) {
            if (board[row-i][col-i])
            {
                return false;
            }
        }

        //for right diagonal
        int maxRight=Math.min(row,board.length-col-1);//this is for wall
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
            {
                return false;// previous queen is blocking the path
            }
        }
        //if all of this is false then return true
        return true;
    }

    private static void display(boolean[][] board) {

        for (boolean[] row: board)
        {
            for (boolean element : row)
            {
                if(element)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static List<List<String>> nqueen(boolean[][] board, int row) {
        List<List<String>> solutions = new ArrayList<>();
        if (row == board.length) {
            solutions.add(displayList(board));
            return solutions;
        }

        // Iterate through columns and try placing queens
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // Place the queen if it is safe
                board[row][col] = true;
                solutions.addAll(nqueen(board, row + 1));
                board[row][col] = false; // Backtrack
            }
        }
        return solutions;
    }
    private static List<String> displayList(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    sb.append("Q ");
                } else {
                    sb.append("* ");
                }
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}
