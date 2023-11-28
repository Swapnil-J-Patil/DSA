package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] answer=position(arr,8);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] position(int[] arr, int target)
    {
        int[] ans={-1,-1};
        //check for first occurrence if target first
        ans[0]= search(arr,target,true);
        if (ans[0] !=-1)
        {
            ans[1]= search(arr,target,false);
        }
        return ans;
    }
     public static int search(int[] arr,int target,boolean findStartIndex)
    {
        int ans=-1;
        int start=0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start) / 2;//so that index will not exceed the range of integer value
            if (target < arr[mid])
            {
                end =mid-1;
            } else if (target>arr[mid])
            {
                start=mid+1;
            }
            else//target == mid
            {
                //potential answer
                ans=mid;
                if(findStartIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
