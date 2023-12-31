package Recursion;

public class Pattern {
    public static void main(String[] args) {
    pattern1(4,0);
    pattern2(4,0);
    }
    public static void pattern1(int row, int col)
    {
        if(row==0)
        {
            return;
        }
        if(row>col)
        {
            System.out.print("*");
            pattern1(row,col+1);
        }
        else
        {
            System.out.println();
            pattern1(row-1,0);
        }
    }
    public static void pattern2(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(row>col)
        {
            pattern2(row,col+1);
            System.out.print("*");
        }
        else
        {
            pattern2(row-1,0);
            System.out.println();
        }
    }
    public int strStr(String haystack, String needle) {
        int i=index(haystack,needle,0);
        return i;
    }
    public static int index(String s, String target,int index)
    {
        if(s.isEmpty())
        {
            return -1;
        }
        if(s.startsWith(target))
        {
            return index;
        }
        return index(s.substring(1),target,index+1);
    }
}
