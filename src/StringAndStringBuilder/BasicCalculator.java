package StringAndStringBuilder;

import java.util.Stack;

//227. Basic Calculator II
public class BasicCalculator {
    public static void main(String[] args) {

    }
    public static int calculate(String s,int ans) {
        Stack<Integer> st=new Stack();
        int num=0;
        char operator='+';

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
                num=num*10+ch[i]-'0';
            if(!Character.isDigit(ch[i]) && ch[i]!=' ' || i==ch.length-1)
            {
                if(operator=='+')
                    st.push(num);
                else if(operator=='-')
                    st.push(-num);
                else if(operator=='*')
                    st.push(st.pop()*num);
                else if(operator=='/')
                    st.push(st.pop()/num);
                num=0;
                operator=ch[i];

            }
        }

        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }

        return sum;

    }
}
