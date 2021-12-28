package com.DSA;

import java.util.Scanner;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        System.out.println("The sum is "+sum(n));
        System.out.println("The sum is "+(1L <<n-1));
    }

    private static long sum(int n) {
        return 1L<<n-1;
    }
}
