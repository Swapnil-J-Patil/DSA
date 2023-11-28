package ArrayProblems.Assignments;

public class smallestMissing {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        System.out.println(smallestMisspositive(arr));
    }
    public static int smallestMisspositive(int[] arr)
    {
        int i=0;
        while (i< arr.length)
        {
            int counter=arr[i]-1;
            if(arr[i]>0 && arr[i]!=arr[counter] && arr[i]<arr.length)
            {
                    swapit(arr, i, counter);
            }
            else
            {
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++)
        {
            if(arr[index]!=index+1)
            {
                return index+1;
            }
        }
        return arr.length+1;
    }

    private static void swapit(int[] arr, int i, int counter) {
        int temp=arr[i];
        arr[i]=arr[counter];
        arr[counter]=temp;
    }
}

