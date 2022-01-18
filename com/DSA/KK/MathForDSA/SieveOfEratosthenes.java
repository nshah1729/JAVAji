package com.DSA.KK.MathForDSA;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
    int n=4000;
    boolean[] prime=new boolean[n+1];//By Default all the values are false
        Arrays.fill(prime,true);//Making all the values to True
    sieve(n,prime);
    }

    //S.C: O(n)
    //T.C: O()

    static void sieve(int n,boolean[] prime){
        for (int i = 2; i*i<= n; i++) {
            if(prime[i]){ //True means it is prime(due to behaviour of the numbers like: 2,3,5,7
                for (int j = 2*i; j <= n; j+=i) {
                    prime[j]=false;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(prime[i]) System.out.print(i+" ");
        }

    }
}
