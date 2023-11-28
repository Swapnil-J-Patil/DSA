package StringAndStringBuilder;

public class MaximumRepeatitions {
    public static void main(String[] args) {
    String s="aaabaaaabaaabaaaabaaaabaaaabaaaaba",w="aaaba";
        System.out.println(maxRepeating(s,w));
    }
    public static int maxRepeating(String sequence, String word) {
        int count = -1;
        String s = "";
        do
        {
            count++;
            s += word;
        }while(sequence.contains(s));
        return count;
    }
}
