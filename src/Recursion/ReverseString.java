package Recursion;

import java.util.Stack;

//151
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
   public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length(),last=n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                sb.append(s.substring(i,last));
                last=i;
            }
        }
    sb.append(' '+s.substring(0,last));
    return sb.toString().replaceAll("\s+"," ").trim();
    }

}
