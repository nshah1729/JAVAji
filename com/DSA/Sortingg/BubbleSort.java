package com.DSA.Sortingg;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={4,9,5,1,0};
//        System.out.println(Arrays.toString(bubbleA(a)));
        System.out.println(Arrays.toString(bubbleD(a)));
    }
    //Ascending Order:
    private static int[] bubbleA(int[] a) {//O(n2)
        for (int i = 0; i <= a.length-1; i++) {     //For Outer Loop: O(n)
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
    //Descending Order:
    public static int[] bubbleD(int[] a){
        for (int i = 0; i <=a.length-1; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j]>a[j-1]){
                    a[j]=a[j]^a[j-1];
                    a[j-1]=a[j]^a[j-1];
                    a[j]=a[j]^a[j-1];
                }
            }
        }
        return a;
    }
}
