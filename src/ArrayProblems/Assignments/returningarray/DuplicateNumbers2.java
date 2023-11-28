package ArrayProblems.Assignments.returningarray;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers2 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4};
        List<Integer>ans=duplicate2(arr);
        System.out.println(ans);
    }
    public static List<Integer> duplicate(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int correct=arr[i]-1;               /*int counter=arr[i]; for 0 to n
                                                  if(arr[i]< arr.length && arr[i]!=arr[counter])*/
            if( arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
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
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    public static List<Integer> duplicate2(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1])
            {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
