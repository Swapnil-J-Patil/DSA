package Recursion.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,8,4,6,2};
        bubblesort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr,int start, int end)
    {
        if(end==0)
        {
            return;
        }
        if(end>start)
        {
           if(arr[start]>arr[start+1])
           {
               int temp=arr[start];
               arr[start]=arr[start+1];
               arr[start+1]=temp;
           }
           bubblesort(arr, start +1, end);
        }
        else
        {
            bubblesort(arr, 0, end - 1);
        }
    }
}
