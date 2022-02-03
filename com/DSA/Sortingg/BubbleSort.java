package com.DSA.Sortingg;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={4,9,5,1,0};
        System.out.println(Arrays.toString(bubble(a)));
    }

    private static int[] bubble(int[] a) {//O(n2)
        for (int i = 0; i < a.length-1; i++) {     //For Outer Loop: O(n)
            for (int j = 1; j < a.length-i; j++) { //For Inner Loop: O(n)
                if(a[j]<a[j-1]){//O(1)
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        return a;
    }
}
