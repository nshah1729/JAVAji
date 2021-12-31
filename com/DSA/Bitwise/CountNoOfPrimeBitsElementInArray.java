package com.DSA.Bitwise;

import java.util.Scanner;

public class CountNoOfPrimeBitsElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(countPrimeSetBits(6,10));
    }
    public static int countPrimeSetBits(int left, int right) {
        int countNoOfPrimes=0;
        for(int i=left;i<=right;i++){
            int temp=i;int count=0;
            while(temp>0){
                if((temp&1)==1)count++;
                temp=temp>>1;
            }
            if(checkPrime(count))countNoOfPrimes++;
        }
        return countNoOfPrimes;
    }

    //Function to check wether the number is Prime

    public static boolean checkPrime(int a){
        if(a<=1)return false;
        boolean flag=true;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){flag=false;break;}
        }
        if(flag)return true;
        return false;
    }

}
