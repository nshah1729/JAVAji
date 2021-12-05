package com.company;

import java.util.Arrays;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] a={};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] a){
        boolean isSwapped;
        for (int i = 0; i < a.length; i++) {
            isSwapped=false;
            for (int j = 1; j < a.length - i; j++) {

                //Swapping
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)break;
        }
    }
}
