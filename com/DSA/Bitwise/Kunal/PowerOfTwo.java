package com.DSA.Bitwise.Kunal;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n)>1?"not power of two":" power of two");
        System.out.println((n&(n-1))==0?"power of two":" not power of two");
    }

    private static int find(int n) {
        int count=0;
        while(n>0){
            n-=(n&-n);
            count++;
        }
        return count;
    }
}
