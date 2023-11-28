package BinarySearch;

public class RotatingSortedArray {
    public static void main(String[] args) {
       int[] arr={4,5,6,7,8,9,10,1,2,3};
        int target=1;
        System.out.println(Range(arr,target));
        System.out.println(NumberOfRotations(arr));

        /*int[] arr1={2,2,5,2,2};
        int target1=5;
        System.out.println(Range(arr1,target1));*/
    }
    public static int NumberOfRotations(int[]arr)
    {
        int pivot=findPivot(arr);
        int ans=pivot+1;
        return ans;
    }
    public static int Range(int[] arr,int target)
    {
        int pivot=findPivot(arr);
        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(pivot<target)
        {
            return binary(arr,target,0,pivot);
        }
        else
        {
            return binary(arr,target,pivot+1,arr.length-1);
        }
        /*
        int pivot1= findPivotWithDuplicate(arr);
        if(arr[pivot1]==target)
        {
            return pivot1;
        }
        if(pivot1<target)
        {
            return binary(arr,target,0,pivot1);
        }
        else
        {
            return binary(arr,target,pivot1+1,arr.length-1);
        }*/
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
    public static int findPivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid< end)
            {
                return mid;
            }
            if(arr[mid]<arr[mid-1] && mid>start)
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        return -1;
    }
   /* public static int findPivotWithDuplicate(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid< end)
            {
                return mid;
            }
            if(arr[mid]<arr[mid-1] && mid>start)
            {
                return mid-1;
            }
            //if the start,end,middle element have equal values
            if(arr[mid]==arr[start] && arr[mid] == arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]>arr[end-1])
                {
                    return end;
                }
                end--;
            }
            //if left side is sorted then element lies on the right side or vise versa
            else if (arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }*/

}
