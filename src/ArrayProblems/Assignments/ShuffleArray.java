package ArrayProblems.Assignments;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2};
        System.out.println(Arrays.toString(shuffle(arr,2)));
    }
    public static int[] shuffle(int[] arr,int n)
    {
        int[] ans=new int[arr.length];
        for (int i = 0; i < n; i++)
        {
            ans[2*i]=arr[i];
            ans[2*i + 1]=arr[i+n];
        }
        return ans;
    }
}
