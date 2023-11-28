package Recursion;

public class PeakOfUnsorted {
    public static void main(String[] args) {
        int[] num={1,2,3,8,4,5};
        System.out.println(findPeakElement(num));
    }
    public static int findPeakElement(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return search(nums,max,0);
    }

    private static int search(int[] arr, int target,int index) {
        if(index==arr.length)
        {
            return 0;
        }
        if(target==arr[index])
        {
            return index;
        }
        return search(arr,target,index+1);
    }
}
