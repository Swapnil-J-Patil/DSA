package StringAndStringBuilder;
//557. Reverse Words in a String III
public class ReverseWordsInString {
    public static void main(String[] args) {
    String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        int start=0;
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ' || i==s.length()-1)
            {
                int end=i;
                while (start<end)
                {
                    if(i!=s.length()-1)
                        str.append(s.charAt(end-1));
                    else
                        str.append(s.charAt(end));
                    end--;
                }
                if(i!=s.length()-1)
                    str.append(" ");
                else
                    str.append(s.charAt(start));
                start=i+1;
            }
        }
        return str.toString();
    }
}
