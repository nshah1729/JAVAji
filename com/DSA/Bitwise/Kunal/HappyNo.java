package com.DSA.Bitwise.Kunal;
//https://leetcode.com/problems/happy-number/

import java.util.Scanner;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(check(n)) System.out.println("Happy No.");
        else{
            System.out.println("Not Happy No.");
        }
    }

    private static boolean check(int n) {
        boolean flag=false;
        int sum=0;
        while(n!=1){
            int rem=n%10;
          sum+=rem*rem;
          n/=10;
        }
        return flag;
    }
}
