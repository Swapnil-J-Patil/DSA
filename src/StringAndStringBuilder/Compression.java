package StringAndStringBuilder;
//925. Long Pressed Name
public class Compression {
    public static void main(String[] args) {
        System.out.println(com("aaabbccddd"));
        System.out.println(compression("aaabbccddd",1));
        System.out.println(isLongPressedName("leelee","lleeelee"));
    }
    public String countAndSay(int n) {
        return compression(String.valueOf(n),1);
    }
    public static String compression(String up,int count) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.length() != 1) {
            if (ch == up.charAt(1)) {
                count++;
                return compression(up.substring(1), count);
            }
        }
        return ch + String.valueOf(count) + compression(up.substring(1), 1);
    }
    public static String com(String s)
    {
        String ans="";
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            char current=s.charAt(i);
            char previous=s.charAt(i-1);

            if(current==previous)
            {
                count++;
                if(i==s.length()-1)
                {
                    ans=ans+current+""+count;
                }
            }
            else
            {
                ans=ans+previous +""+count;
                count=1;
            }
        }
        return ans;
    }
    public static boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        int i=0;
        int j=0;
        if(name.charAt(0) != typed.charAt(0)) //if first letter is wrong then return false
            return false;
        if(n>m){            // to check if name has more chars than typed
            return false;
        }
        while(i<n && j<m){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j))    //check if prev char is same as current type char
            {
                j++;
            }
            else{
                return false;       //here the char next is not matching
            }
        }
        while(j<m){       //check for remaining letters of type
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<n){      // if name letters are remaining at this stage then return false
            return false;
        }
        return true;
    }
    }
