package com.company;

import java.util.Arrays;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] a={634,234635,754,785,786,689,790,47};
        int[] x={634,234635,754,785,786,689,790,47};
        int[] y={634,234635,754,785,786,689,790,47};
        bubble(a);
        bubblee(x);
        bubbleee(y);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
    static void bubble(int[] x){
        boolean isSwapped;
        for (int i = 0; i < x.length; i++) {
            isSwapped=false;
            for (int j = 1; j < x.length - i; j++) {

                //Swapping
                if(x[j]<x[j-1]){
                    int temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)break;
        }
    }

    //=======ALITER=========
    static void bubblee(int[] x){
        boolean isSwapped;
        for (int i = x.length-1; i >= 0; i--) {
            isSwapped=false;
            for (int j = 1; j <=i; j++) {

                //Swapping
                if(x[j]<x[j-1]){
                    int temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)break;
        }
    }
    //=======ALITER=========
     static void bubbleee(int[] x){
        boolean isSwapped;
        for (int i = x.length-1; i >= 0; i--) {
            isSwapped=false;
            for (int j = 0; j <i; j++) {

                //Swapping
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)break;
        }
    }

}
