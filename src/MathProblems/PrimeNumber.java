package MathProblems;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int c=2;
        while (c*c<=num)
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
