package StringAndStringBuilder;
//28. Find the Index of the First Occurrence in a String
public class StringSearch {
    public static void main(String[] args) {
        String name="Swapnil";
        char target='S';
        Boolean ans= Search(name,target);
        System.out.println(ans);
        System.out.println(name);

    }

    private static Boolean Search(String name, char target) {
        if (name.length()==0)
        {
            return false;
        }
        for (char ch : name.toCharArray()) {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }
    public static int strStr(String haystack, String needle,int index) {
        if(haystack.isEmpty())
        {
            return -1;
        }
        if(haystack.startsWith(needle))
        {
            return index;
        }
        return strStr(haystack.substring(1),needle,index+1);
    }
}
