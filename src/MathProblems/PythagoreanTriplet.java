package MathProblems;

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8};
        int[] ans=pythagorean(arr);
        if(ans[0]!=-1)
        {
            System.out.println("It is a Pythagorean triplet" + Arrays.toString(ans));
        }
        else
        {
            System.out.println("Not a Pythagorean triplet");
        }
    }
    public static int[] pythagorean(int[] num)
    {
        int x=0;
        int y=0;
        int z=0;
        int end= num.length-1;
        for (int i = 0; i < end; i++)
        {
            for (int j = i+1; j <end ; j++)
            {
                for (int k = j+1; k < end; k++)
                {
                    x=num[i]*num[i];
                    y=num[j]*num[j];
                    z=num[k]*num[k];

                    if(x+y==z || y+z==x || x+z==y)
                    {
                        return new int[] {num[i],num[j],num[k]};
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}
