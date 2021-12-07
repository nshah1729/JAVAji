package com.DSA;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
     int[] p={1,2,3,4,5};
     int t=9;

        System.out.println(Arrays.toString(find(p,t)));
    }
    static int[] find(int[] n, int t){
        int s=0,e=n.length-1;
        while(s<e){
            if((n[s]+n[e])==t)break;
            else if((n[s]+n[e])>t)e--;
            else{s++;}
        }
        return new int[]{s+1,e+1};
    }
}
