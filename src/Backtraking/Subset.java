package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(sub(arr));
    }
    public static List<List<Integer>> sub(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
