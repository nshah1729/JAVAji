package com.DSA.Sortingg;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={1,2,3,5,4};
        System.out.println(Arrays.toString(bubbleA(a)));
//        System.out.println(Arrays.toString(bubbleD(a)));
    }
    //Ascending Order:
    private static int[] bubbleA(int[] a) {//O(n2)
        for (int i = 0; i <= a.length-1; i++) {     //For Outer Loop: O(n)
            boolean swapped=false;
            for (int j = 1; j < a.length-i; j++) { //For Inner Loop: O(n)
                if(a[j]<a[j-1]){//O(1)
                    swapped=true;
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }//If you didn't swap for a particular value of 'i',
            // that means that the array is sorted ∴break
            if(!swapped)break;
        }
        return a;
    }
    //Descending Order:
    public static int[] bubbleD(int[] a){
        for (int i = 0; i <=a.length-1; i++) {
            boolean swapped=false;
            for (int j = 1; j < a.length-i; j++) {
                if(a[j]>a[j-1]){
                    swapped=true;
                    a[j]=a[j]^a[j-1];
                    a[j-1]=a[j]^a[j-1];
                    a[j]=a[j]^a[j-1];
                }
            }
            if(!swapped)break;
        }
        return a;
    }
}
