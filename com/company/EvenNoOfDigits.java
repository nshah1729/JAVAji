package com.company;

import java.util.Scanner;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(even(a[i]))k++;
        }
        System.out.println(k+" elements contains even number of Digits!");
    }
    static boolean even(int a){
        int dig=0;
        while(a>0){
            dig++;a/=10;
        }
        return dig%2==0;
    }
}
