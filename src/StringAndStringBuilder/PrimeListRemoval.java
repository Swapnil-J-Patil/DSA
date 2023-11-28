package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeListRemoval {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s=sc.nextInt();
            arr.add(s);
        }
        System.out.println(paliremove(arr));
    }
    public static List paliremove(List<Integer> arr)
    {
        for (int i = arr.size()-1; i >=0 ; i--) {
            boolean isPrime=primenum(arr.get(i));
            if(isPrime)
            {
                arr.remove(i);
            }
        }
        return arr;
    }

    private static boolean primenum(Integer integer) {
        if(integer==2)
        {
            return true;
        }
        int c=2;
        while (c*c<integer)
        {
            if(integer%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>integer;
    }

}

