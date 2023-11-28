package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-10,-5,1,2,3,4,5,10};
        System.out.println(binary(arr,-10));
    }
    public static int binary(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start) / 2;//so that index will not exceed the range of integer value
            if (target < arr[mid])
            {
                end =mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}