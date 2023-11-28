package ArrayProblems;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr={11,2,3,4,5};
        System.out.println(min(arr));
    }
    public static int min(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}
