package com.DSA.KK.MathForDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        fac2(n);
    }

    private static void fac(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i==0) System.out.print(i+" ");
        }
    }
    private static void fac2(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                if(n/i==i) System.out.print(i+" ");
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
