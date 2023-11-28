package StringAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String st = "";
        String s = "0P";
        System.out.println(pali(st));
        System.out.println(isPalindrome(s));
    }

    public static String pali(String st) {
        if (st == null || st.length() == 0) {
            return "Palindrome";
        }
        st = st.toLowerCase();
        int start = 0;
        int end = st.length() - 1;
        while (start < end) {
            if (st.charAt(start) == st.charAt(end)) {
                start++;
                end--;
            } else {
                return "Not Palindrome";
            }
        }
        return "Palindrome";
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}

