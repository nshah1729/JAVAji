package com.DSA.KKRecursion;

import java.util.Scanner;

public class gugu {
    public static void main(String[] args) {
        boolean m=Integer.valueOf(0).equals(Long.valueOf(1));
        System.out.println(m);
        System.out.println(Integer.valueOf(23));
        System.out.println(fib(10));
    }
    static int fib(int n){
        if(n==1)return 1;
        return n*fib(n-1);
    }
}
