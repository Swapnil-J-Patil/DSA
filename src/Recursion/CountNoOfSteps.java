package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountNoOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(8));
        int[] arr={1,4,4,5,4};
        System.out.println(isSorted(arr,0));
        System.out.println(linearSearch(arr,1,0));
        System.out.println(firstAnsLast(arr,4));
        System.out.println(allIndex(arr,4,0));
        int[] arr1={5,6,7,8,2,3,4};
        System.out.println(pivot(arr1,0));
        System.out.println(binarySearch(arr1,2,0,arr1.length-1));
    }
    public static int steps(int num)
    {
        return countsteps(num,0);
    }

    private static int countsteps(int n, int count) {
        if(n==0)
        {
            return count;
        }
        if(n%2==0)
        {
            return countsteps(n/2,count+1);
        }
        return countsteps(n-1,count+1);
    }
    public static boolean isSorted(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
            return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
    public static int linearSearch(int[] arr,int target,int index)
    {
        if(index>arr.length-1)
        {
            return -1;
        }
        if(target==arr[index])
        {
            return index;
        }
        return linearSearch(arr,target,index+1);
    }
    public static List<Integer> firstAnsLast(int[] arr,int target)
    {
        List<Integer> ans=new ArrayList<>();
        ans.add(firstOccur(arr,target,0));
        ans.add(lastOccur(arr,target,arr.length-1));
        return ans;
    }

    private static Integer firstOccur(int[] arr, int target,int i) {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        return firstOccur(arr,target,i+1);
    }
    private static Integer lastOccur(int[] arr, int target,int i) {
        if(i==-1)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        return lastOccur(arr,target,i-1);
    }

    public static List<Integer> allIndex(int[] arr,int target, int index)
    {
        List<Integer> sol=new ArrayList<>();
        if(index==arr.length)
        {
            return sol;
        }

        if(arr[index]==target)
        {
            sol.add(index);
        }
        List<Integer> ans=allIndex(arr,target,index+1);
        sol.addAll(ans);
        return sol;
    }
    public static int pivot(int[] arr,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]>arr[index+1])
        {
            return index;
        }
        return pivot(arr,index+1);
    }
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        //to check if the first half is sorted or not
        if(arr[start]<arr[mid])
        {
            //to check if the element lies over here
            if(target>=arr[start] && target<=arr[mid])
            {
                return binarySearch(arr,target,start,mid-1);
            }
            else
            {
                return binarySearch(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end])
        {
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);
    }
}
