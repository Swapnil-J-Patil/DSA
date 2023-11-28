package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Acronym {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("abc");
        str.add("hti");
        str.add("nir");
        System.out.println(isAcronym(str,"ann"));
        System.out.println(ans(str,"ahn"));

    }
    public static boolean isAcronym(List<String> words, String s) {
        if(s.isEmpty())
        {
            return true;
        }
        int count=0;
        for (int  i=0;i<s.length() && i<words.size();i++)
        {
            boolean ans=singleword(words.get(i),s.charAt(i));
            if(ans)
            {
                count++;
            }
        }
        if(count==words.size() && count==s.length())
            return true;

        return false;
    }
    public static boolean singleword(String s, char c)
    {
        if(s.startsWith(String.valueOf(c)))
        {
            return true;
        }
        return false;
    }
    public static boolean ans(List<String> words, String s)
    {
        int i=0;
        for (String w: words) {
            if(w.charAt(0)!=s.charAt(i))
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
