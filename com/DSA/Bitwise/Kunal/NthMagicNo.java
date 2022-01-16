package com.DSA.Bitwise.Kunal;

import java.util.Scanner;

public class NthMagicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        magic(n);
    }

    private static void magic(int n) {
        int ans=0;int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base*=5;
        }
        System.out.println(ans);
    }
}
