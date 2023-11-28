package ArrayProblems.Assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sum2 {
    public static void main(String[] args) {
    int[] arr={2,3,5,8};
    int target=7;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
