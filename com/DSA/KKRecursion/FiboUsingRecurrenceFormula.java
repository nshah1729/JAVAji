package com.DSA.KKRecursion;

import java.util.HashSet;
import java.util.Scanner;

public class FiboUsingRecurrenceFormula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.println(i+"th Fibonacci Number is "+fib(i));
        }
    }

    private static int fib(int n) {
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
