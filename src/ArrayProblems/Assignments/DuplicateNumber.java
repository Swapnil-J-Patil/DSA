package ArrayProblems.Assignments;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {//given [1 to N]

    public static void main(String[] args) {
        int[] arr={1,4,2,3,4};
        System.out.println(Duplicate(arr));
    }
    public static int Duplicate(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int correct=arr[i]-1;
            if( arr[i]!=i+1)
            {
                if(arr[i]!=arr[correct])//checks whether given number is already present at desired index
                    {
                        swapme(arr, i, correct);
                    }
                else
                    {
                        return i;
                    }

                }
            else
            {
                i++;
            }
            }
          return -1;
        }
    private static void swapme(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> ans=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        if(ans.size()== arr.length)
        {
            return false;
        }
        return true;
    }
}
