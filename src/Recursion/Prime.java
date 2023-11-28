package Recursion;

public class Prime {
    public static void main(String[] args) {
        int n=40;
        boolean[] isPrime= new boolean[n+1];
        check(n,isPrime);
    }
    public static void check(int n, boolean[] primes)
    {
        for (int i = 2; i*i<=n ; i++)//start from 2 and till sqrt of n
        {
            if(!primes[i])//check the flag
            {
                for (int j = i*2; j <=n ; j+=i)
                {
                    primes[j]=true;
                }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if(!primes[i])
            {
                System.out.println(i + " ");
            }
        }
    }
}
