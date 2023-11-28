package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PalindromeSubstring {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(allpali("abbc"));
        System.out.println(longestPalisub("abbac"));

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
    public static List<String> allpali(String str)
    {
        List<String> string=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String pal=str.substring(i,j);
                if(ispali(pal))
                {
                    string.add(pal);
                }
            }
        }
        return string;
    }
    public static boolean ispali(String s)
    {
        int start=0;
        int end=s.length()-1;
        while (start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static String longestPalisub(String str)
    {
        List<String> string=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String pal=str.substring(i,j);
                if(ispali(pal))
                {
                    string.add(pal);
                }
            }
        }
        Collections.sort(string, Comparator.comparingInt(String::length));
        return string.get(string.size()-1);
    }
}
