package ArrayProblems;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=1;
        int end= 4;
        int target=5;
        boolean ans= SearchIn(arr,start,end,target);
        System.out.println(ans);
    }

    private static boolean SearchIn(int[] arr, int start, int end, int target) {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=start;i<=end;i++)
        {
            if(i==target)
            {
                return true;
            }
        }
        return false;
    }
}
