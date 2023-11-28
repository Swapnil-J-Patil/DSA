package StackAndQueue;

import java.util.Arrays;

public class GameOfTwoStacks {
    public static void main(String[] args) {

    }
    public static int maxMoves(int max, int[] a, int[] b)
    {
        return recursionCalls(max, a,b,0,0)-1;
    }
    private static int recursionCalls(int max, int[] a, int[] b,int sumSofar,int count)
    {
        if(sumSofar>max)
        {
            return count;
        }

        if(a.length==0 || b.length==0)
        {
            return count;
        }
        int ans1=recursionCalls(max, Arrays.copyOfRange(a,1,a.length-1),b,sumSofar +a[0],count+1);
        int ans2=recursionCalls(max,a, Arrays.copyOfRange(b,1,b.length-1),sumSofar +b[0],count+1);

        return Math.max(ans1,ans2);

    }
}
