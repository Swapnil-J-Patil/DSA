package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1773. Count Items Matching a Rule
public class MatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        System.out.println(countMatches(items,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int n=0;
        switch (ruleKey)
        {
            case "type":
                n=0;
                break;
            case "color":
                n=1;
                break;
            case "name":
                n=2;
                break;
        }
        for(List l:items)
        {
            if (isTrue(n,ruleValue,l))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean isTrue(int n, String s, List list)
    {
        if((list.get(n).equals(s)))
        {
            return true;
        }
        return false;
    }
}
