package com.DSA.Sortingg;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={1,-2,4,2,3};
        select(a);
    }

    private static void select(int[] a) {       // O(n2)
        for (int i = 0; i < a.length; i++) {
            int lastIndex=a.length-i-1;
            int getMaxIndex=max(0,lastIndex,a);
            swap(getMaxIndex,lastIndex,a);
        }
        System.out.println(Arrays.toString(a));
    }
//Swapping
    private static void swap(int i, int lastIndex, int[] a) {
        int temp=a[i];
        a[i]=a[lastIndex];
        a[lastIndex]=temp;
    }
//Finding the maximum element
    private static int max(int start,int last,int[] a) {
        int max=start;
        for (int i = start; i <= last; i++) {
            if(a[i]>a[max])max=i;
        }
        return max;
    }
}
