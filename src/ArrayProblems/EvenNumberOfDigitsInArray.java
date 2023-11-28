package ArrayProblems;

public class EvenNumberOfDigitsInArray {
    public static void main(String[] args) {
        int[] num={12,345,2,6,7895};
        System.out.println(findevennumbers(num));

        //also used for counting digits of a number
        int number=0;
        System.out.println(digits(number));
        System.out.println(digitsoptimized(1245));
    }
        //counting digits
    private static int digits(int num) {
        int countdigits=0;
        if(num == 0)
        {
            return 1;
        }
        if(num < 0)
        {
            num=num * -1;
        }
        while(num>0)
        {
            countdigits++;
            num=num/10;
        }
        return countdigits;
    }
    private static int digitsoptimized(int num) {
        int countdigits=0;
        if(num == 0)
        {
            return 1;
        }
        if(num < 0)
        {
            num=num * -1;
        }

        return (int)(Math.log10(num)) + 1;//log representation of number to find the digits
    }

    public static int findevennumbers(int[] arr)
    {
        int count=0;
        for(int num : arr)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;

    }

    private static boolean even(int num) {
        int countdigits=0;
        while(num>0)
        {
            countdigits++;
            num=num/10;
        }
        if(countdigits % 2==0){
            return true;
        }
        return false;
    }
}
