package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//46. Permutations
public class PermutationArray {
    public static void main(String[] args) {
    int[] arr={1,1,2};
        System.out.println(permute(arr));
        System.out.println(permuteUnique(arr));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permuteRec(nums, 0, result);
        return result;
    }
    public static void permuteRec(int[] nums, int begin, List<List<Integer>> result) {
        if (begin == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums)
                temp.add(num);
           // if(!result.contains(temp)) to get unique elements in list add this line
            result.add(temp);
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            // Swap
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;

            permuteRec(nums, begin + 1, result);

            // Swap back
            temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
        }
    }
//------------------------------------------------------------------------------------------------------------------------------------------
//for unique items
static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    helper(nums,0,new ArrayList<>());
    return result;
}
    public static void helper(int []arr,int start,List<Integer> templist){
        if(templist.size()==arr.length){
            result.add(new ArrayList<>(templist));
            return;
        }else if(templist.size()<arr.length){
            for(int i=0;i<arr.length;i++){
                if((i>0 && arr[i]!=arr[i-1])||i==0){
                    if(arr[i]!=-999){
                        templist.add(arr[i]);
                        int temp=arr[i];
                        arr[i]=-999;
                        helper(arr,i,templist);
                        arr[i]=temp;
                        templist.remove(templist.size()-1);
                    }
                }
            }
        }
    }
}
