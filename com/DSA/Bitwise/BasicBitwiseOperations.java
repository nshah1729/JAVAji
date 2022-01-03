package com.DSA.Bitwise;

public class BasicBitwiseOperations {
    public static void main(String[] args) {
        int n=12,i=3;
        //Check if ith bit is set
        if(isSet(n,i)) System.out.println("Yes, it is set!");
        else System.out.println("Oops!, it is no set!");
    }

    private static boolean isSet(int n, int i) {
        int mask=1<<i;
        if((n&mask)==0)return false;
        return true;
    }
}
