package com.DSA;

import java.util.Scanner;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={4,3,2,1};
        selection(a);
        System.out.println(Arrays.toString(a));
    }
    static void selection(int[] a){
        for (int i = 0; i < a.length; i++) {
            //Find the max element in the remaining array and replace it with the current index
            int last=a.length-i-1;
            int maxIndex=getMax(a, last);
            swap(a,maxIndex,last);
        }
    }

    private static void swap(int[] a, int maxIndex, int last) {
        int temp=a[maxIndex];
        a[maxIndex]=a[last];
        a[last]=temp;
    }

    static int getMax(int[] a,int last){
        int max=0;
        for (int i = 0; i <=last; i++) {
            if(a[max]<a[i]) max=i;
        }
        return max;
    }
}
