package MathProblems;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5,1));
    }
    public static int factorial(int num)
    {
        int fact=1;
        for (int i = 1; i <= num; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int fact(int n,int f)
    {
        if(n==1)
        {
            return f;
        }
        f=n*fact(n-1,f);
        return f;
    }
}
