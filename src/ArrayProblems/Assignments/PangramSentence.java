package ArrayProblems.Assignments;

import java.util.HashSet;
import java.util.Set;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence="qwertyuiopasdfghjklzxcvbnm";
        System.out.println(isPangram(sentence));
    }
    public static boolean isPangram(String sentence)
    {
        //set contains only unique values hence once all 26 values are assigned it will not store repeated values
        int n=sentence.length();
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            Character c=sentence.charAt(i);
            set.add(c);
        }
        return set.size()==26;
    }
}
