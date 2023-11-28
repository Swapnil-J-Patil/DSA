package ArrayProblems.Assignments;

import java.util.Arrays;

public class ArrayOfPermutation {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        permutation(arr);
    }
    public static void permutation(int[] arr)
    {
        int[] ans=new int[arr.length];

         for (int j: arr)
         {
              ans[j]=arr[arr[j]];
         }
        System.out.println(Arrays.toString(ans));
    }
}
