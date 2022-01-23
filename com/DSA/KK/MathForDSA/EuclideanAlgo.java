package com.DSA.KK.MathForDSA;

import java.util.Scanner;

//For Finding the GCD
public class EuclideanAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        System.out.println("HCF is "+euclid(a,b));
        System.out.println("LCM is "+(a*b)/euclid(a,b));
    }

    private static int euclid(int a, int b) {
        if(a==0)return b;
        return euclid(b%a,a);
    }
}
