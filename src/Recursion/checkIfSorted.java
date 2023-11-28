package Recursion;

public class checkIfSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr,int index)
    {
        if(index== arr.length-1)
        {
            return true;
        }
        return arr[index]< arr[index+1] && check(arr,index+1);
    }
}
