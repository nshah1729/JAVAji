package com.DSA.KK.MathForDSA;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        fac(n);
    }

    private static void fac(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i==0) System.out.print(i+" ");
        }
    }
}
