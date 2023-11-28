package MathProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPali(1221);
    }
    public static void isPali(int num)
    {
        int ans=0;
        int number=num;
        while (num>0)
        {
            int rem=num%10;
            ans=ans*10 +rem;
            num=num/10;
        }
        if(number==ans)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}
