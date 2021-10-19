package com.company;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++){

            a[i]= sc.nextInt();
        }
        System.out.println(miss(a));
    }
    public static int miss(int[] a) {
        int sum=0,l=a.length;
        for (int i= 0; i < l; i++) {
            sum+=a[i];
        }
        return l*(l-1)/2-sum;
    }
}
