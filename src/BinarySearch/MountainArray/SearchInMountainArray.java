package BinarySearch.MountainArray;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,4,2};
        int target=4;
        System.out.println(Search(arr,target));
    }
    public static int Search(int[] arr, int target)
    {
        int peak=mountainArr(arr);                                           //getting the peak of the mountain
        int firstTry=ordered(arr,target,0,peak);                        //ascending order
        if(firstTry!= -1)
        {
            return firstTry;
        }
        return ordered(arr,target,peak+1,arr.length-1);             //descending order
    }
    public static int mountainArr(int[] arr)
    {
        int start=0;
        int end=arr.length -1;
        while (start< end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid+1])                     //then elements are in desc order
            {
                end=mid;                                //this may be the answer but look for left elements
            }
            else                                        //then elements are in asc order
            {
                start=mid+1;                               //as the current middle+1 element is already greater than middle element
            }
        }
        return start;//or return end
    }
    public static int ordered(int[] arr, int target,int start,int end)
    {

        boolean isAsc= arr[start]< arr[end];
        boolean isDes= arr[start]> arr[end];
        while (start<=end)
        {
            int mid = start + (end - start) / 2;               //so that index will not exceed the range of integer value

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
