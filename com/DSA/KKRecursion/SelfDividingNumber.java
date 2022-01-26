package com.DSA.KKRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfDividingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        ArrayList<Integer> ans=selfie(a,b);
        System.out.println(ans.toString());
    }

    private static ArrayList<Integer> selfie(int a, int b) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = a ;i <= b; i++) {
            if(check(i)) list.add(i);
        }
        return list;
    }

    private static boolean check(int x) {
        int tem=x;
       while(tem>0){
           if(tem%10==0)return false;
           if(x%(tem%10)!=0)return false;
           tem/=10;
       }
       return true;
    }
}
