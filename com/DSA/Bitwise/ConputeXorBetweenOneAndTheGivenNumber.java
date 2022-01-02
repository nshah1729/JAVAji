package com.DSA.Bitwise;

import java.util.Scanner;

public class ConputeXorBetweenOneAndTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= sc.nextInt();
        System.out.println("The Result is "+xorCompute(n));
        System.out.println("The Result is "+compute(n));

    }

    private static int xorCompute(int n) {
        if(n%4==0)return n;
        if(n%4==1)return 1;
        if(n%4==2)return n+1;
        if(n%4==3)return 0;
        return -1;
    }

    private static int compute(int n) {
        int ans=0;int i=1;
        while(i<=n){
            ans=ans^i;
            i++;
        }
        return ans;
    }
}
