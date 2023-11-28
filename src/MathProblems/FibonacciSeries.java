package MathProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int num=sc.nextInt();
        fibonacii(num);
    }
    public static void fibonacii(int num)
    {
        int a=0;
        int b=1;
        int count=0;
        while (count<num)
        {
            System.out.print(a + " ");
            int temp=b;
            b=b+a;
            a=temp;

            count++;
        }

    }
}
