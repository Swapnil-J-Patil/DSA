package ArrayProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,5,6,4,8,44};
        int target=19;
        int ans= linearsearch(nums,target);
        System.out.println(ans);
    }
     public static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index< arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
