package BinarySearch.MountainArray;

public class MountainOrBitonicArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,4,2};
        System.out.println(mountainArr(arr));
    }
    public static int mountainArr(int[] arr)
    {
        int start=0;
        int end=arr.length -1;
        while (start< end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid+1])//then elements are in desc order
            {
                end=mid;//this may be the answer but look for left elements
            }
            else //then elements are in asc order
            {
                start=mid+1;//as the current middle+1 element is already greater than middle element
            }
        }
        return start;//or return end
    }
}
