package StringAndStringBuilder;

import java.util.Arrays;

public class commonPrefix {
    public static void main(String[] args) {
        String[] str={"ans","ant","answer"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); //after sorting, we will compare first and last string of array

        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;

        while (index <s1.length() && index<s2.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        return s1.substring(0,index);
    }
}
