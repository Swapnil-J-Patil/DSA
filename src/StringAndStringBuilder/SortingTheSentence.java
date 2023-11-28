package StringAndStringBuilder;
//1859. Sorting the Sentence
public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];

        for (String word : words) {
            // Get 0th-based index from the word
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            // Store the original word without a numeric value
            bucket[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", bucket);
    }
}
