package ArrayProblems.Assignments;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        smallerCount(arr);
    }

    public static void smallerCount(int[] arr)
    {
        int[] ans=new int[arr.length];
        int count=0;
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
                if(j==arr.length-1)
                {
                    ans[i] = count;
                    count=0;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
