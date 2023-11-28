package MathProblems;

import java.util.Scanner;

public class AllPrimeNumbersWithinRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range:");
        int first=sc.nextInt();
        int second=sc.nextInt();
        allPrimeWithinRange(first,second);
    }
    public static void allPrimeWithinRange(int first,int second)
    {
        for (int i = first; i <=second; i++)
        {
            boolean ans=isPrime(i);
            if(ans)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num)
    {
        int c=2;
        if(num<=1)
        {
            return false;
        }
        while (c*c<num)
        {
            if(num%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>num;
    }
}
