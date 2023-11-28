package ArrayProblems;

public class CountTeams {
    public static void main(String[] args) {

      int[] arr={2,5,3,4,1};
        System.out.println(numTeams(arr));
    }
    public static int numTeams(int[] rating) {
        int count=0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i+1; j < rating.length; j++) {
                for (int k = j+1; k < rating.length; k++) {

                    if(rating[i]< rating[j] && rating[j]< rating[k] || rating[i] >rating[j] && rating[j] > rating[k])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
