package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {//max item will come at last index-i-1
    public static void main(String[] args) {
        int[] arr={2,5,7,1,6,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {
          int last= arr.length -i -1;
          int maxElementIndex=getMaxIndex(arr,0,last);
          swap(arr,maxElementIndex,last);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int end)
    {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
