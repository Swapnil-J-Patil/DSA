package Recursion;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,5,5,3,4,2,7,5};
        int[] arr3={5,6,7,8,1,2,3};
        System.out.println(search(arr,0,arr.length-1,4));
        System.out.println(searchall(arr2,0,5,new ArrayList<>()));
        System.out.println(searchitems(arr2,5,0));
        System.out.println(rotated(arr3,0,arr3.length-1,6));
    }
    public static int search(int[] arr,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start +(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]<target)
        {
            return search(arr,mid+1,end,target);
        }
        return search(arr,start,mid-1,target);
    }
    public static ArrayList searchall(int[] arr,int index,int target,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return searchall(arr,index+1,target,list);
    }

    public static ArrayList searchitems(int[] arr, int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcall= searchitems(arr,target,index+1);
        list.addAll(ansfrombelowcall);
        return list;
    }
    public static int rotated(int[] arr, int start, int end ,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start + (end - start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[start]<arr[mid])
        {
            if(target > arr[start] && target< arr[mid])
            {
                return rotated(arr,start,mid-1,target);
            }
            return rotated(arr,mid+1,end,target);
        }
        if(target>arr[mid+1] && target<arr[end])
        {
            return rotated(arr,mid+1,end,target);
        }
        //here if we are searching 6 in 5,6,1,2,3,4 then this will run

        return rotated(arr,start,mid-1,target);
    }
}
