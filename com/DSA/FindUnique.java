package com.DSA;

public class FindUnique {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,4};
        System.out.println(ans(a));
    }

    private static int ans(int[] a) {
        int ans=0;
        for(int x:a){
            ans^=x;
        }
        return ans;
    }
}
