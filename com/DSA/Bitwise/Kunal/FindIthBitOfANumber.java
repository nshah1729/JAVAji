package com.DSA.Bitwise.Kunal;

import java.util.Scanner;

public class FindIthBitOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("Enter the bit to find: ");
        int i= sc.nextInt();
        find(n,i);
    }

    private static void find(int n, int i) {
        System.out.println("The "+i+"th"+" bit is: "+(n&(1<<(n-1))));
    }
}
