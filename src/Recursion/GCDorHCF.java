package Recursion;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(9,18));
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(sumdigits(123));
    }
    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a, int b)
    {
        return a*b /gcd(a, b);
    }
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }
    public static int sumdigits(int n)
    {
        if(n<1)
        {
            return 0;
        }
        System.out.print(n%10);
        return sumdigits(n/10) + n%10;
    }
}
