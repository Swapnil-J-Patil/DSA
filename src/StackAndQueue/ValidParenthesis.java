package StackAndQueue;

import java.util.Stack;

//20.Valid Parenthesis
//921. Minimum Add to Make Parentheses Valid
public class ValidParenthesis {
    public static void main(String[] args) {
        String s="(()))";
        System.out.println(minInsertions(s));

    }
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>(); // create an empty stack
            for (char c : s.toCharArray()) {
                if (c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c)
                    //pop will not only retrieve the char but also will remove it from the stack
                    return false;
            }

            return stack.isEmpty();
        }
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack
        for (char c : s.toCharArray()) {
            if(c==')')
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.size();
    }
        public static int minInsertions(String s) {
            Stack<Character> stack=new Stack<>();
            int count=0;
            for(int i=0;i<s.length();i++){
// -Keep adding left barckets
                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }else{
                    if(i+1<s.length()&& s.charAt(i+1)==')'){
                        // -Skip it as two consecutives are present
                        i++;
                    }else count++;

                    if(!stack.isEmpty()){
                        stack.pop();
                    }else count++ ;
                }
            }
            count+=2*stack.size();
            return count;
        }
}
