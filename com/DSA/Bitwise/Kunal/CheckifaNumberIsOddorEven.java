package com.DSA.Bitwise.Kunal;

import java.math.BigInteger;
import java.util.Scanner;
//Q1
public class CheckifaNumberIsOddorEven {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("Enter the number: ");
            int n= sc.nextInt();
            System.out.println((n & 1) == 1 ? "Odd" : "Even");
            if(n==0)break;
        }
    }
}
