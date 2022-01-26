package com.DSA.KKRecursion;

import java.util.Scanner;

public class gugu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println(checkPerfectNumber(n));
    }
    public static boolean checkPerfectNumber(int n) {
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)sum+=i;
        }
        return sum == n;
    }
}
