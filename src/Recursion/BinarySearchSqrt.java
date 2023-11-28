package Recursion;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(36));
    }
    public static int sqrt(int n)
    {
        int start=0;
        int end=n;
        while (start<=end)
        {
            int mid=start +(end-start)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            if(mid*mid>n)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
