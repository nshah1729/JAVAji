package com.DSA.Bitwise.Kunal;

import java.util.Scanner;

public class FindNoOfsetbitsORkerninghanFormula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        find(n);
    }
    //Kerninghan's Formula:O(logn)
    private static void find(int n) {
        int ans=0;
        while(n>0){
            n-=(n&-n);//Clearing the RSB
            //We can also do n=n&(n-1) instead of n-=(n&-n)
            ans++;
        }
        System.out.println(ans);
    }

}
