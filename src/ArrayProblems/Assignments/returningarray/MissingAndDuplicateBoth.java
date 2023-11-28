package ArrayProblems.Assignments.returningarray;

import java.util.ArrayList;
import java.util.List;

public class MissingAndDuplicateBoth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        List<Integer> ans = missdup(arr);
        List<Integer> ans2 = missdupnum(arr);
        System.out.println(ans);
        System.out.println(ans2);

    }

    public static List<Integer> missdup(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapnumbers(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
                ans.add(j + 1);
            }
        }
        return ans;
    }

    private static void swapnumbers(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static List<Integer> missdupnum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(i);
                list.add(i + 1);
            }
        }
        return list;
    }
}
