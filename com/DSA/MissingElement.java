package com.DSA;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] b=new int[4];
        for(int i=0;i<4;i++){
            b[i]= sc.nextInt();
        }
        System.out.println(miss(b));
    }
    public static int miss(int[] a) {
        int sum=0,l=a.length;
        for (int k= 0; k < l; k++)sum+=a[k];
        return l*(l-1)/2-sum;
    }
}