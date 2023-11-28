package StringAndStringBuilder;
//2038. Remove Colored Pieces if Both Neighbors are the Same Color
public class NeighboursProblem {
    public static void main(String[] args) {
        System.out.println(winnerOfGame("AAABBB",0,1));
    }
    public static boolean winnerOfGame(String colors,int index,int count) {
        if(colors.isEmpty())
        {
            return count%2!=0;
        }
        StringBuilder s=new StringBuilder(colors);
        if(count==1) {
            if (colors.startsWith("AAA")) {
                s.deleteCharAt(index + 1);
                return winnerOfGame(s.toString(), 0, 2);
            }
        }
        else
        {
            if (colors.startsWith("BBB")) {
                s.deleteCharAt(index + 1);
                return winnerOfGame(s.toString(), 0, 1);
            }
        }
        return winnerOfGame(s.substring(1), 0, 1);
    }
}
