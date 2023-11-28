package ArrayProblems;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void Swap(int[] arr, int start, int end) {
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
