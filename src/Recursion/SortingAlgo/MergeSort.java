package Recursion.SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={5,3,7,4,8,1};
        System.out.println(Arrays.toString(mergesort(arr)));
        mergewithoutcopy(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid= arr.length/2;

        int[] left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right)
    {
        int[] mix=new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< left.length && j< right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i];
                i++;
            }
            else
            {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        //to copy remaining elements
        while (i< left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
    // ***************************************************************************************************************************************
    public static void mergewithoutcopy(int[] arr,int start, int end)
    {
        if(end - start==1)
        {
            return;
        }

        int mid= start +(end- start)/2;
        mergewithoutcopy(arr,start,mid);
        mergewithoutcopy(arr,mid,end);

        mergefun(arr,start,mid,end);
    }

    private static void mergefun(int[] arr, int start, int mid, int end) {
        int[] mix=new  int[end- start];
        int i=start;
        int j=mid;
        int k=0;

        while (i< mid && j<end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i< mid)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j< end)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l]=mix[l];
        }
    }
}
