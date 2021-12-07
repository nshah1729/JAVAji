package com.DSA;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        p(100);
    }
    static int p(int n){
        System.out.println(n);
        if(n==0)return -1;
        return p(n-1);
    }
}
