package com.DSA;

import java.util.Scanner;

public class noOfDigitsBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println("The base: ");
        int b= sc.nextInt();
        System.out.println(digit(n,b));
//        System.out.println(digits(n));
    }

    private static int digits(int n) {
        int ans=0;
        while (n>0){
            n=n>>1;
            ans++;
        }
        return ans;
    }
    private static int digit(int n,int b){
        return (int)(Math.log(n)/Math.log(b))+1;
    }
}
