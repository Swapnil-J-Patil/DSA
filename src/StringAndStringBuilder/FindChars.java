package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class FindChars {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("apple");
        str.add("jfle");
        str.add("caple");
        long startTime = System.currentTimeMillis();
        List<String> result = stringslist(str, "pl");
        long endTime = System.currentTimeMillis();

        System.out.println("Matching strings: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
    public static List<String> stringslist(List<String> str,String target)
    {
        int count=0;
        List<String> ans=new ArrayList<>();
        for (String i :str) {
            count=stringtarget(i,target);
            if(count==target.length())
            {
                ans.add(i);
            }
        }
        return ans;
    }

    public static int stringtarget(String s, String target) {

        int count=0;
        for (int i = 0; i < target.length(); i++) {
            boolean ans=justString(s,target.charAt(i));
            if(ans)
            {
                count++;
            }
        }
        return count;
    }

    public static boolean justString(String s, char c)
    {
        if(s.isEmpty())
        {
            return false;
        }
        if(s.charAt(0)==c)
        {
            return true;
        }
        return justString(s.substring(1),c);
    }
}
