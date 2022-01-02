package com.DSA.Bitwise;

public class ComputeXorBetweenAgivenRange {
    public static void main(String[] args) {
        System.out.println(Compute(3,6));
        System.out.println(3^4^5^6);
    }

    private static int Compute(int a, int b) {
        return xor(a)^xor(b-1);
    }

    private static int xor(int x) {
        if(x%4==0)return x;
        if(x%4==1)return 0;
        if(x%4==2)return x+1;
        if(x%4==3)return 1;
        return -1;
    }

}
