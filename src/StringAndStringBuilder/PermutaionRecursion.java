package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class    PermutaionRecursion {
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
        System.out.println(permutationcount("","abc"));
    }
    public static List<String> permutation(String p, String up)
    {

        if(up.isEmpty())
        {
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        List<String> ans=new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutation(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static int permutationcount(String p, String up)
    {

        if(up.isEmpty())
        {
            List<String> list=new ArrayList<>();
            list.add(p);
            return list.size();
        }
        char ch=up.charAt(0);
        List<String> ans=new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutation(f+ch+s,up.substring(1)));
        }
        return ans.size();
    }
}
