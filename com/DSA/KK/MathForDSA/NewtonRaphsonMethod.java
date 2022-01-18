package com.DSA.KK.MathForDSA;

import java.util.Scanner;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(nRsqrt(n));
    }

    private static double nRsqrt(int n) {
        double x=n;
        double root;
        //Break only when the Error is <1
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(x-root)<1)break;
            x=root;
        }
        return root;
    }
}
