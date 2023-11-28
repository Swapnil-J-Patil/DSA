package StringAndStringBuilder;

public class ToggleClass {
    public static void main(String[] args) {
        System.out.println(toggle("sFSsd"));
        System.out.println(output("G()()(al)",new StringBuilder()));
    }
    public static StringBuilder toggle(String s)
    {
        StringBuilder string=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c=string.charAt(i);
            if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z')
            {
                char upc=(char) (c +'A'-'a');
                string.setCharAt(i,upc);
            }
            else
            {
                char lwc=(char) ('a'+c -'A');
                string.setCharAt(i,lwc);
            }
        }
        return string;
    }
    public static String output(String s,StringBuilder str)
    {
        if(s.isEmpty())
        {
            return str.toString();
        }

        if(s.startsWith("()"))
        {
            str.append("o");
        }
        if(s.startsWith("(al)"))
        {
            str.append("al");
        }
        if(s.startsWith("G"))
        {
            str.append("G");
        }
        return output(s.substring(1),str);
    }
}
