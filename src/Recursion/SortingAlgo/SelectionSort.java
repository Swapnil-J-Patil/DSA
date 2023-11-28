package Recursion.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        selectionsort(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr, int start, int end, int max)
    {
        if(end==0)
        {
            return;
        }
        if(start<end)
        {
            if(arr[start]>arr[max])
            {
                selectionsort(arr,start+1,end,start);
            }
            else
            {
                selectionsort(arr,start+1,end,max);
            }
        }
        else
        {
            int temp=arr[max];
            arr[max]=arr[end-1];
            arr[end-1]=temp;
            selectionsort(arr,0,end-1,0);
        }
    }
}
