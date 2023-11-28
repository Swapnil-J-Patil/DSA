package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class DiceCombinations {
    public static void main(String[] args) {
        System.out.println(combo("",5));
    }
    public static List<String> combo(String p, int target)
    {
        if(target==0)
        {
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        for (int i = 1; i<=target ; i++) {
            ans.addAll(combo(p+i,target-i));
        }
        return ans;
    }
}
