package BinarySearch.MountainArray;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={70,50,4,0,10,5,4,3,1,-2,-5};
        int[] arr1={-10,-5,1,2,3,4,5,10};
        System.out.println(ordered(arr1,10));
    }
    public static int ordered(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;

        boolean isAsc= arr[start]< arr[end];
        boolean isDes= arr[start]> arr[end];
        while (start<=end)
        {
            int mid = start + (end - start) / 2;//so that index will not exceed the range of integer value

            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if (target < arr[mid])
                {
                    end =mid-1;
                } else
                {
                    start=mid+1;
                }
            }
            if (isDes)
            {
                if (target < arr[mid])
                {
                    start=mid+1;
                } else
                {
                    end =mid-1;
                }
            }
        }
        return -1;
    }
}
