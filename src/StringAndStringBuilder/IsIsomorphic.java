package StringAndStringBuilder;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
    String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n != m) return false; // Check if the lengths of s and t are different. In our example, n = 3, and m = 3, so this condition is not met.
        if (s.equals(t)) return true; // Check if the strings are identical. In our example, they are not identical, so this condition is not met.

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i); // At the beginning, c = 'e', and d = 'a'.
            char d = t.charAt(i);

            if (map.containsKey(c)) {
                if (!map.get(c).equals(d)) return false; // In our example, 'e' is already mapped to 'a', and 'a' does match 'a', so it continues to the next character.
            }
            else {
                if (map.containsValue(d)) return false; // Check if d is already mapped to a different character. In our example, 'a' is not already mapped, so it proceeds to add the mapping.
                map.put(c, d); // Add the mapping 'e' -> 'a'.
            }
        }
        return true; // After the loop completes, it returns true, indicating that the strings are isomorphic.
    }
}
