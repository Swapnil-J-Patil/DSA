package ArrayProblems.Assignments;

import java.util.Arrays;

public class Sum3 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        sum3(arr);
        System.out.println(plusOne(arr));
    }
    public static void sum3(int[] arr)
    {

        boolean result=false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length-i; j++)
            {
                for (int k = j+1; k < arr.length-i; k++)
                {
                    if(i!=j && j!=k && i!=k && arr[i]+arr[j]+arr[k]==0 )
                    {
                        int[] ans= {arr[i],arr[j],arr[k]};
                        System.out.println(Arrays.toString(ans));
                        result=true;
                    }
                }
            }
        }
        if(!result)
        {
            System.out.println("[]");
        }
    }
    public static int[] plusOne(int[] digits) {
        int ans=0;
        for(int i=0;i<digits.length;i++)
        {
            ans=ans*10 + digits[i];
        }
        ans=ans+1;
        for(int i=digits.length-1;i>0;i--)
        {
            digits[i]=ans%10;
            ans=ans/10;
        }
        return digits;
    }
    public int maximumSwap(int num) {
        if(num < 10) return num;

        char[] arr = String.valueOf(num).toCharArray();

        int[] rightIndex = new int[10]; // to hold the last index of each digit

        for(int i=0; i<arr.length; i++){
            rightIndex[arr[i] - '0'] = i;  // arr[i] - '0' converts char to num
        }

        for(int i=0; i<arr.length; i++){  // index of present digit we are looking at
            for(int j=9; j>arr[i] - '0'; j--){ // max digit could be 9 and min be GREATER than the present digit we looking at
                if(rightIndex[j] > i){  // if index of 'j' (starts with 9) is greater than present index (basically, is the bigger digit at RIGHT of present digit)
                    // swap and return the answer
                    char temp = arr[i];
                    arr[i] = arr[rightIndex[j]];
                    arr[rightIndex[j]] = temp;
                    return Integer.valueOf(new String(arr)); // return here
                }
            }
        }

        // if we reach till here, that means no swapping is required in the input number.
        return num;
    }
}
