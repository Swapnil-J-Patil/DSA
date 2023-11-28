package ArrayProblems;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] num={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=5;
        int[] ans=search(num,target);
        System.out.println(Arrays.toString(ans));
        int maximum=max(num);
        System.out.println(maximum);
        int minimum=min(num);
        System.out.println(minimum);
    }
    public static int[] search(int[][] arr,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] ==target)
                {
                    return new int[] {row,column};
                }
            }

        }
        return new int[]{-1,-1};
    }
    public static int min(int[][] arr)
    {
        int min= Integer.MAX_VALUE;
        for (int[] array :arr)
        {
            for(int element : array)
            {
                if(element<min)
                {
                    min=element;
                }
            }
        }
        return min;
    }
    public static int max(int[][] arr)
    {
        int max= Integer.MIN_VALUE;
        for (int[] array :arr)
        {
            for(int element : array)
            {
                if(element>max)
                {
                    max=element;
                }
            }
        }
        return max;
    }
}
