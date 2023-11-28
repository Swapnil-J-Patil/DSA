package BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search2D(arr,29)));

        int [][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(sortedSearching2DArray(arr1,5)));
    }
    public static int[] search2D(int[][] matrix,int target)
    {
        int row=0;
        int column=matrix.length-1;

        while (row<matrix.length && column>=0)
        {
            if(matrix[row][column]==target)
            {
                return new int[]{row,column};
            }
            if(matrix[row][column]<target)
            {
                row++;
            }
            else
            {
                column--;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] binarySearch(int[][] matrix,int row, int cStart,int cEnd,int target)
    {
        while (cStart<=cEnd)
        {
            int mid=cStart + (cEnd - cStart)/2;
            if(matrix[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target)
            {
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] sortedSearching2DArray(int[][] matrix,int target)
    {
        int row=matrix.length;
        int column=matrix[0].length;//be cautious matrix may be empty

        if(row==1)
        {
            return binarySearch(matrix,0,0,column-1,target);
        }

        int rStart=0;
        int rEnd=matrix.length-1;
        int cMid=column/2;

        //run the loop till two rows are remaining
        while (rStart< rEnd-1)
        {
            int mid=rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target)
            {
                rStart=mid;
            }
            else
            {
                rEnd=mid;
            }
        }
        //now we have two rows and check whether the target is in the column of 2 rows

        if(matrix[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target)
        {
            return new int[]{rStart + 1,cMid};
        }

        //search in first half
        if (target <=matrix[rStart][cMid -1])
        {
           return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in second half
        if (target >=matrix[rStart][cMid +1] && target <=matrix[rStart][column -1])
        {
            return binarySearch(matrix,rStart,cMid+1,column-1,target);
        }
        //search in third half
        if (target <=matrix[rStart + 1][cMid -1])
        {
            return binarySearch(matrix,rStart + 1,0,cMid-1,target);

        }
        //search in fourth half
        else
        {
            return binarySearch(matrix,rStart + 1,cMid+1,column-1,target);
        }
    }
}