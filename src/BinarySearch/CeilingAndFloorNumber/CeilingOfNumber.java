package BinarySearch.CeilingAndFloorNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(majorityElement(arr));
        System.out.println(reverse(123));
        System.out.println(subsets(arr));
    }
    //smallest number greater than or equal to given number
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
                return arr[mid];
            }
        }
        return arr[start];
    }
    public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for (int i = 0; i < prices.length; i++) {
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
    public static int reverse(int x) {
        int ans=0;
        int n=x;
        Boolean negative=false;
        if (n < 0) {
            negative = true;
            n = x * (-1);
        }
        if (negative) {
            while (n > 0) {
                int rem = n % 10;
                if(ans>(Integer.MAX_VALUE-rem)/10)
                {
                    return 0;
                }
                ans = ans * 10 + rem;
                n = n / 10;
            }
            return -ans;
        } else {

            while (n > 0) {
                int rem = n % 10;
                if(ans>(Integer.MAX_VALUE-rem)/10)
                {
                    return 0;
                }
                ans = ans * 10 + rem;
                n = n / 10;
            }
        }
        return ans;
    }
    public int maxArea(int[] height) {
       int start=0;
       int end= height.length-1;
       int max=0;
       while (start<=end)
       {
           int h=Math.min(height[start],height[end]);
           int w=end-start;
           int area=h*w;
           max=Math.max(max,area);
           if(height[start]<height[end])
           {
               start++;
           }
           else if(height[start]>height[end])
           {
               end--;
           }
           else
           {
               start++;
               end--;
           }
       }
       return max;
    }
    //Given an integer array nums, find the
    //subarray
    // with the largest sum, and return its sum.
    public int maxSubArray(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        pwh(nums,0,subset,ans);
        return ans;
    }
    public static void pwh(int []nums,int i,ArrayList<Integer> subset,List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        pwh(nums,i+1,subset,ans);
        subset.remove(subset.size()-1);
        pwh(nums,i+1,subset,ans);
    }
}
