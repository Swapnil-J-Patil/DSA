package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }
    public static List<StringBuilder> permutation(String s)
    {
        int n=s.length();
        int fact=factorial(n);
        List<StringBuilder> strings=new ArrayList<>();
        for (int i = 0; i < fact; i++) {
            int temp=i;
            StringBuilder str=new StringBuilder(s);
            for (int div = n; div >=1 ; div--) {
                int q=temp/div;
                int r=temp%div;
                str.append(str.charAt(r));
                str.deleteCharAt(r);
                temp=q;
            }
            strings.add(str);

        }
        return strings;
    }
    public static int factorial(int n)
    {
        int fact=1;
        for (int i = 2; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
}
