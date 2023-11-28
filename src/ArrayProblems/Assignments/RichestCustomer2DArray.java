package ArrayProblems.Assignments;

public class RichestCustomer2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Rich(arr));
    }
    public static int Rich(int[][] Accounts)
    {
        int rich=0;
        for (int i = 0; i < Accounts.length; i++)
        {
            int temp=0;
            for (int j = 0; j < Accounts[i].length; j++)
            {
                temp+=Accounts[i][j];
            }
            if(temp>rich)
            {
                rich=temp;
            }
        }
        return rich;
    }
}
