package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
    }
    public static void pattern1(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col=1;col<=n-row+1;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col=1;col<=row;col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        for (int row = 0; row < 2*n; row++) {
            int totalColNo=row>n ? 2*n-row : row;//
            for (int col = 0; col <totalColNo ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n)
    {
        for (int row = 0; row <2*n ; row++)
        {

            int totalColNo=row>n ? 2*n-row : row;//
            int spaces=n-totalColNo;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColNo; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void pattern7(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            int spaces=n-row+1;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--)
            {
                System.out.print(col);
            }
            for (int col = 2; col<=row ; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}