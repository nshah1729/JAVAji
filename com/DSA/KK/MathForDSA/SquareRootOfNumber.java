package com.DSA.KK.MathForDSA;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("Enter the Precision: ");
        int p= sc.nextInt();
        System.out.println(square(n,p));
    }

    private static double square(int n,int p) {
       int s=0,e=n;
       double root=0.0;
       while(s<=e){           //Applying Binary Search for finding Integer Value of the Root
           int m=s+(e-s)/2;
           if(m*m==n)return m;
           else if(m*m>n)e=m-1;
               else s=m+1;
       }
       //For the numbers which are not Perfect Squares.
       double incr=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
       return root;
    }

}
