package ArrayProblems.Assignments;

import java.util.Arrays;

//747. Largest Number At Least Twice of Others
public class LargestNo {
    public static void main(String[] args) {
    int[] num={0,2,0,3};
        System.out.println(dominantIndex(num));
    }
    public static int dominantIndex(int[] nums) {
        int n = nums.length;
        int the1stLargest = -1;
        int the2ndLargest = -1;
        int indexMax = 0;
        if(n == 1) return 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > the1stLargest){
                the2ndLargest = the1stLargest;
                the1stLargest = nums[i];
                indexMax = i;
            }else if(nums[i] > the2ndLargest){
                the2ndLargest = nums[i];
            }
        }
        if(the1stLargest >= the2ndLargest*2)
            return indexMax;
        return -1;
    }
}
