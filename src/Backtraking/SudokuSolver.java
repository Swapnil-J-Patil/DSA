package Backtraking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board=new int[][]{ {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(solve(board))
        {
            displaysudoku(board);
        }
        else
        {
            System.out.println("Cannot solve the Sudoku");
        }
    }
    public static boolean solve(int[][] board)
    {
        int n= board.length;
        int row=-1;
        int col=-1;

        boolean emptyLeft=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0)
                {
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            //if you found the empty element in row then break
            if(!emptyLeft)
            {
                break;
            }
        }
        if(emptyLeft)
        {
            return true;
            //sudoku is solved
        }

        //now backtrack
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number))
            {
                board[row][col]=number;
                if(solve(board))
                {
                    //found the answer
                    return true;
                }
                else
                {
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;
    }

    private static void displaysudoku(int[][] board) {
        for(int[] row: board)
        {
            for (int num: row)
            {
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board,int row, int col,int num)
    {
        //to check for the row

        for (int i = 0; i < board.length; i++) {
            //check if the number is already present or not
            if(board[row][i]==num)
            {
                return false;
            }
        }

        //to check for the col

        for (int[] n: board) {
            //check if the number is already present or not
            if(n[col]==num)
            {
                return false;
            }
        }

        int sqrt=(int)(Math.sqrt(board.length));
        int rowstart= row -row%sqrt;
        int colstart=col -col%sqrt;

        //to check in 3x3
        for (int r = rowstart; r < rowstart +sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt; c++) {
              if(board[r][c]==num)
              {
                  return false;
              }
            }
        }
        return true;
    }
}
