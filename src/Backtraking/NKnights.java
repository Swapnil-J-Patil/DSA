package Backtraking;

public class NKnights {
    public static void main(String[] args) {

        int n=4;
        boolean[][] board=new boolean[n][n];
        nKnight(board,0,0,4);
    }
    public static void nKnight(boolean[][] board,int row,int col,int knight)
    {
        // if we placed all the knights
        if(knight==0)
        {
            display(board);
            System.out.println();
            return;
        }

        //if it is going out of bounds
        if(row==board.length-1 && col== board.length-1)
        {
            return;
        }

        //if we are at the end of the column
        if(col==board.length)
        {
            nKnight(board,row+1,0,knight);
            return;
        }

        //if it is safe to place the knight
        if(isSafe(board,row,col))
        {
            board[row][col]=true;
            nKnight(board,row,col+1,knight-1);
            board[row][col]=false;
        }

        //if we couldn't place it anywhere then increase the column by one
        nKnight(board,row,col+1,knight);
    }
    public static boolean isSafe(boolean[][] board,int row,int col)
    {
        /*  ->
            |
            |   */

        if(valid(board,row-2,col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }

        /*  <-
             |
             |   */
        if(valid(board,row-2,col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }

        /*  -->
            |
              */
        if(valid(board,row-1,col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }

        /*  <--
              |  */
        if(valid(board,row-1,col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        return true; // if nothing returns false then return true
    }
    //to check the valid row and column again and again - Remove redundancy
    public static boolean valid(boolean[][] board,int row,int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board.length )
        {
            return true;
        }
        return false;
    }
    public static void display(boolean[][] board)
    {
        for (boolean[] row: board)
        {
            for (boolean element: row)
            {
                if(element)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    /*public static void nKnight(boolean[][] board, int row, int col, int knights, List<List<String>> solutions) {
        if (knights == 0) {
            solutions.add(display(board));
            return;
        }

        if (row == board.length - 1 && col == board.length - 1) {
            return;
        }

        if (col == board.length) {
            nKnight(board, row + 1, 0, knights, solutions);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnight(board, row, col + 1, knights - 1, solutions);
            board[row][col] = false;
        }

        nKnight(board, row, col + 1, knights, solutions);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (valid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }

        if (valid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }

        if (valid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }

        if (valid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        return true;
    }

    public static boolean valid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    public static List<String> display(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    sb.append("K ");
                } else {
                    sb.append("* ");
                }
            }
            solution.add(sb.toString());
        }
        return solution;
    }*/
}
