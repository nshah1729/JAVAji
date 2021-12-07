package com.DSA;

import java.util.Scanner;

public class fiboRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=fibo(50);
        System.out.println(n);
    }
    static int fibo(int n){

        //Base Condition
        if(n<2)return n;

        //Body
        return fibo(n-1)+fibo(n-2);
    }
}
