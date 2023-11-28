package MathProblems;

public class ArmstrongNumber {
    public static void main(String[] args) {
       Armstrong(153);
    }
    public static void Armstrong(int num)
    {
        int ans=0;
        int number=num;
        while (num>0)
        {
            int rem=num%10;
            ans=ans +(rem*rem*rem);
            num=num/10;
        }
        if(ans==number)
        {
            System.out.println("Number is Armstrong Number");
        }
        else
        {
            System.out.println("Number is not Armstrong Number");
        }
    }
}
