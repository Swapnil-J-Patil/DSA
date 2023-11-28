package MathProblems;

import java.util.Scanner;

public class NumberOfSameDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Enter digit from above number:");
        int target=sc.nextInt();
        System.out.println(count(num,target));
    }
    public static int count(int num,int target)
    {   int counter=0;
        while (num>0)
        {
            int rem=num%10;
            if(rem==target)
            {
                counter++;
            }
            num=num/10;
        }
        return counter;
    }
}
