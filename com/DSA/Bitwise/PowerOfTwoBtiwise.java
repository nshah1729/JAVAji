package com.DSA.Bitwise;

public class PowerOfTwoBtiwise {
    public static void main(String[] args) {
        int n=129;
        System.out.println(checkPowerOfTwo(n));
        System.out.println((n&(n-1))==0);//ALITER
    }

    private static boolean checkPowerOfTwo(int n) {
        int count=0;
        while(n>0){
            if((n&1)==1)count++;//n&1 is same as n%10
            n=n>>1;//Same as n/=10;
        }
        if(count==1)return true;
        return false;
    }
}
