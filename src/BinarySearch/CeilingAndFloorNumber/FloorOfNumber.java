package BinarySearch.CeilingAndFloorNumber;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,9,11};
        System.out.println(ceiling(arr,10));
    }
    //greatest number smaller than or equal to given number

    public static int ceiling(int[] arr, int target)
    {
        //if number is greater than the greatest number in array

        if(target > arr[arr.length-1])
        {
            return -1;
        }
        int start= 0;
        int end= arr.length -1;
        while (start<=end)
        {
            int mid = start + (end - start) / 2;//so that index will not exceed the range of integer value
            if (target < arr[mid])
            {
                end =mid-1;
            } else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}
