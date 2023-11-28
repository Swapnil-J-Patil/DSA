package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    //Aka Sinking Sort or Exchange Sort
    public static void main(String[] args) {

        int[] arr={2,5,7,9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr)
    {   //run the steps n-1 times
        boolean swapped=false;
        for (int i = 0; i <arr.length ; i++)
        {
            //for each step, max item will come at the respective index
            for (int j = 1; j < arr.length -i ; j++) {
                //swap if the item smaller than previous item
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swapped=true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped)
                break;
        }
    }
}