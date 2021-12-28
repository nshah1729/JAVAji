package com.DSA;

import java.util.Scanner;

public class MagicNoBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(magicNo(n));
    }

    private static int magicNo(int n) {
        int ans=0,base=5;
        while(n>0){
            int last=n&1;
            ans+=last*base;
            base*=5;
            n=n>>1;
        }
        return ans;
    }
}
