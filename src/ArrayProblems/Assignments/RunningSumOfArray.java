package ArrayProblems.Assignments;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1};
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {

            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
