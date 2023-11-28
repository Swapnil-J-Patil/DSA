package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//500. Keyboard Row
public class KeyboardRow {
    public static void main(String[] args) {
    String[] str={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(str)));
    }
    public static String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(check(words[i],one) || check(words[i],two) || check(words[i],three)){
                list.add(words[i]);
            }
        }
        String[] arr = new String[list.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }
    public static boolean check(String s,String checker){
        boolean temp = true;
        for(char c : s.toCharArray()){
            boolean isTrue = false;
            for(char ch : checker.toCharArray()){
                if(c == ch){
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue){
                return false;
            }
        }
        return temp;

    }
}
