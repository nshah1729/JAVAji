package com.DSA.KK.MathForDSA;

import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(checkTwo(i)) System.out.print(i+",");
            System.out.println(i+" is "+(checkTwo(i)?"Prime":"Not Prime"));
//            System.out.println(i+" is "+(checkOne(i)?"Prime":"Not Prime"));
        }
    }
    //Method 1: O(n)
    public static boolean checkOne(long n){
        if(n<=1)return false;
        for (long i = 2; i < n; i++) if(n%i==0) return false;
        return true;
    }

    //Method 2: O(√n)
    public static boolean checkTwo(long n){
        if(n<=1)return false;
        for (long i = 2; i*i <= n; i++) if(n%i==0) return false;
        return true;
    }

    //Method 3: O(√n)

}
