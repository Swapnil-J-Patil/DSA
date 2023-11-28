package StackAndQueue;

import java.util.Stack;

//1021. Remove Outermost Parentheses
public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                stack.push(s.charAt(i+1));
                i++;
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty())
        {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
