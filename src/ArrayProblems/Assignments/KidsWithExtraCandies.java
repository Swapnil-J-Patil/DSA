package ArrayProblems.Assignments;

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandies {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int extracandy=3;
        System.out.println(kidsWithCandies(arr,extracandy));
    }
    public static List<Boolean> kidsWithCandies(int[] arr, int extra) {
        int greatest=max(arr);
        List<Boolean> ans=new ArrayList<>();
        for (int candy = 0; candy < arr.length; candy++) {
            if(arr[candy]+extra>=greatest)
            {
                ans.add(candy,true);
            }
            else
            {
                ans.add(candy,false);
            }
        }
        return ans;
    }
    public static int max(int[] arr)
    {
        int maximum=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            maximum= Math.max(maximum,arr[i]);
        }
        return maximum;
    }
}
