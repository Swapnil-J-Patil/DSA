package MathProblems;

public class sumOfNnumbers {
    public static void main(String[] args) {

        System.out.println(sum(3));
    }
    public static int sum(int limit)
    {
        int sum=limit*(limit+1)/2;
        return sum;
    }
}
