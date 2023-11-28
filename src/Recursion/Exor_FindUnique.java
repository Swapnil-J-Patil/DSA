package Recursion;

public class Exor_FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,4,6};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr)
    {
        int uique=0;
        for(int n : arr)
        {
            uique^=n;
        }
        return uique;
    }
}