package com.DSA.Bitwise;

public class BitwiSe {
    public static void main(String[] args) {
        int a=11;
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return (a & 1)==1;
    }
}
