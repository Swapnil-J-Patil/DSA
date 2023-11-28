package ArrayProblems.Assignments;

import java.util.Arrays;

public class GoodPair {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        pair(arr);

    }
    public static void pair(int[] arr)
    {
        boolean result=false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length ; j++)
            {
                if(arr[i]==arr[j] && i<j)
                {
                    int[] ans={i,j};
                    System.out.print(Arrays.toString(ans) + " ");
                    result=true;
                }
            }
        }
        if(!result)
        {
            System.out.println("No good pair");
        }
    }
}
