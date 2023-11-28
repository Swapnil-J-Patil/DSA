package MathProblems;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num=1234;
        System.out.println(reverse(num));
    }
    public static int reverse(int num)
    {
        int ans=0;
        while (num>0)
        {
            int rem=num%10;
            ans=ans*10 + rem;
            num=num/10;
        }
        return ans;
    }
}
