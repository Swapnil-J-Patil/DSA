package ArrayProblems.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(targetArr(arr,index)));
    }
    public static int[] targetArr(int[] arr,int[] index)
    {
        int[] ans=new int[arr.length];
        List<Integer>l1=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++)
        {
            l1.add(index[i],arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            ans[i]=l1.get(i);
        }
        return ans;
    }
}
