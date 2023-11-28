package StringAndStringBuilder;
import java.util.*;

public class PhoneCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("235"));
    }
    public static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        int totalCombinations = 1;
        for (char digit : digits.toCharArray()) {
            totalCombinations *= map.get(digit).length();
        }

        for (int i = 0; i < totalCombinations; i++) {
            StringBuilder combination = new StringBuilder();
            int temp = i;
            for (char digit : digits.toCharArray()) {

                String letters = map.get(digit);//here you will get abc or def

                int letterIndex = temp % letters.length(); //here it will go like first a(abc) and in second iteration d(def)
                combination.append(letters.charAt(letterIndex));// then b(abc) and d(def)
                temp /= letters.length();
            }
            result.add(combination.toString());
        }

        return result;
    }
}
