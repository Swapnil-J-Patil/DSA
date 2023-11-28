package ArrayProblems.Assignments;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,4,2,0,1,6,7};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[] arr) {
        int sum=0;
        for (int i:arr)
        {
            sum+=i;
        }
        int n= arr.length;
        int total=n*(n+1)/2;
        int ans=total-sum;
        return ans;
    }
}
