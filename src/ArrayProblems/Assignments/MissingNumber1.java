package ArrayProblems.Assignments;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber1 {
    public static void main(String[] args) {
        int[] arr={2};
     //   System.out.println(missingNum(arr));
        System.out.println(findKthPositive(arr,1));
    }
    public static int missingNum(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int counter=arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[counter])
            {
                swapit(arr,i,counter);
            }
            else
            {
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        return arr.length;
    }

    private static void swapit(int[] arr, int i, int counter) {
        int temp=arr[i];
        arr[i]=arr[counter];
        arr[counter]=temp;
    }
    public static int findKthPositive(int[] arr, int k) {
        int current=arr[0];
        int i=1;
        //2,3,4,7,11
        List<Integer> ans=new ArrayList<>();
        if(arr[0]-1!=0)
        {
            int diff=arr[0]-1;
            int add=1;
            for (int j = 0; j <diff ; j++) {
                int temp=add;
                ans.add(temp);
                add++;
            }
        }
        while(i<arr.length)
        {
            if(arr[i]-current==1)
            {
                current=arr[i];
                i++;
            }
            else
            {
                int diff=arr[i]-current;
                int add=1;
                for (int j = 0; j <diff-1 ; j++) {
                    int temp=current+add;
                    ans.add(temp);
                    add++;
                }
                current=arr[i];
                i++;
            }
        }
        if(ans.size()<k)
        {
            int add=1;
            for (int j = 0; j < k; j++) {
                ans.add(arr[arr.length-1]+add);
                add++;
            }
        }
        return ans.get(k-1);
    }
}
