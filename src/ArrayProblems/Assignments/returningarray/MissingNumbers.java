package ArrayProblems.Assignments.returningarray;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {//use list when you don't know the length of the answer
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=missingNums(arr);
        System.out.println(ans);
    }
    public static List<Integer> missingNums(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int correct=arr[i]-1;               //int counter=arr[i]; for 0 to n

            if( arr[i]!=arr[correct])
            {
                swapnums(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();

        for (int j = 0; j < arr.length ; j++)
        {
            if(arr[j]!=j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
    private static void swapnums(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
