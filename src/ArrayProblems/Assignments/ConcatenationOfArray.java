package ArrayProblems.Assignments;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,7};
        concat(arr);
    }
    public static void concat(int[] arr)
    {
        int n= arr.length;
        int[] ans=new int[arr.length*2];
        for (int i = 0; i < arr.length; i++)
        {
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
