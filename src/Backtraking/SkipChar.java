package Backtraking;

import java.util.ArrayList;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skip("bassit"));
        System.out.println(skipstring("sdldsapple"));
        System.out.println(skipsome("sjkjsappgkapple"));
        System.out.println(subsequence("","abc"));
    }
    public static String skip(String ups)
    {
        if(ups.isEmpty())
        {
            return "";
        }
        char ch=ups.charAt(0);
        if(ch=='a')
        {
            return skip(ups.substring(1));
        }
        else
        {
            return ch + skip(ups.substring(1));
        }
    }
    public static String skipstring(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple"))
        {
            return skipstring(s.substring(5));
        }
        else
        {
            return ch + skipstring(s.substring(1));
        }
    }
    public static String skipsome(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple"))
        {
            return skipsome(s.substring(3));
        }
        else
        {
            return s.charAt(0) + skipsome(s.substring(1));
        }
    }
    public static ArrayList<String> subsequence(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsequence(p+ch,up.substring(1));
        ArrayList<String> right=subsequence(p,up.substring(1));

        left.addAll(right);
        return left;

    }
}
