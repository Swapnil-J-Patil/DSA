package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {//when given numbers from 1 to N
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr,int num1,int num2)
    {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
}
