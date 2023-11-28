package Recursion;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(123));
        System.out.println(product(130));
       /* System.out.println(reverse(123));
        System.out.println(rev(134,3));*/
        System.out.println(ispali(12321));
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reversearr(arr,0,arr.length-1)));
        System.out.println(countzero(12000210,0));
    }
    public static int sum(int n)
    {
        if(n%10==n)
        {
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static int product(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return n%10 * product(n/10);
    }
    static int ans=0;
    public static int reverse(int n)
    {

        if(n==0)
        {
            return ans;
        }
        int rem = n % 10;
        ans = (ans * 10) + rem;
        return reverse(n / 10);
    }
    public static int rev(int n,int zero)
    {
        if(n==0)
        {
            return 0;
        }
        int rem=n%10;
        int ans= (int) (rem*Math.pow(10,zero-1));

        return ans+rev(n/10,zero-1);
    }
    public static boolean ispali(int n)
    {
        return n==reverse(n);
    }
    public static int[] reversearr(int[] n,int start,int end)
    {
        if(start>end)
        {
            return n;
        }
        int temp=n[start];
        n[start]=n[end];
        n[end]=temp;

        return reversearr(n,start+1,end-1);

    }
    public static int countzero(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        int rem=n%10;
        if(rem==0)
            count++;
        return countzero(n/10,count);

    }
}
