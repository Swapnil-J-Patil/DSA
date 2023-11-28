package MathProblems;
//441. Arranging Coins
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(long n) {
        return (int) ((- 1 + Math.sqrt((double) 1 + 8 * n))/ 2);
    }
}
