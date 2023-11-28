package StringAndStringBuilder;
//657. Robot Return to Origin
public class RobotOrigin {
    public static void main(String[] args) {
    String s="UDLRD";
        System.out.println(judgeCircle(s));
    }
    public static boolean judgeCircle(String moves) {
        if(moves.isEmpty())
        {
            return true;
        }
        if(moves.length()%2!=0)
        {
            return false;
        }
        String str=moves.substring(0,2);
        switch(str)
        {
            case "UD", "RL", "LR", "DU":
                return judgeCircle(moves.substring(2));
            default:
                return false;
        }
    }
    //better and right appproach
    public boolean judgeCircle2(String moves) {
        int UpDown = 0;
        int LeftRight = 0;

        for (char c : moves.toCharArray() )
        {
            if (c == 'U')
                UpDown++;
            else if (c == 'D')
                UpDown--;
            else if (c == 'R')
                LeftRight++;
            else if (c == 'L')
                LeftRight--;
        }
        return (LeftRight == 0 && UpDown == 0);
    }
}
