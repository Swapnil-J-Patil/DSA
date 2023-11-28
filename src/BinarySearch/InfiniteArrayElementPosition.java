package BinarySearch;

public class InfiniteArrayElementPosition {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=9;
        System.out.println(answer(arr,target));
    }
    public static int answer(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while (target>arr[end])
        {
            int tempstart=end+1;
            end=end +(end - start +1)*2;
            start=tempstart ;
        }
        return binary(arr,target,start,end);
    }
    public static int binary(int[] arr, int target,int start,int end)
    {
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
        return -1;
    }
}
