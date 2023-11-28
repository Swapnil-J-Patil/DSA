package Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();

        boolean ans=(a &(a-1))==0;
        System.out.println(ans);
    }
}
