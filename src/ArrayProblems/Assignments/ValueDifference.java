package ArrayProblems.Assignments;

import java.util.Arrays;

//2903. Find Indices With Index and Value Difference I
public class ValueDifference {
    public static void main(String[] args) {
    int[]  nums = {5,1,4,1};
    int indexDifference = 2, valueDifference = 4;
        System.out.println(Arrays.toString(findIndices(nums,indexDifference,valueDifference)));
    }
    public static int[] findIndices(int[] A, int indexDifference, int valueDifference) {
        int mini = 0, maxi = 0, n = A.length;

        for (int i = indexDifference; i < n; i++) {
            if (A[i - indexDifference] < A[mini])
                mini = i - indexDifference;
            if (A[i - indexDifference] > A[maxi])
                maxi = i - indexDifference;

            if (A[i] - A[mini] >= valueDifference)
                return new int[] {mini, i};
            if (A[maxi] - A[i] >= valueDifference)
                return new int[] {maxi, i};
        }
        return new int[] { -1, -1};
    }
}
