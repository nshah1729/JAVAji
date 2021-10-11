package com.company;

public class SelectionSort {
    public static void main(String[] args) {

    }
    static void Select(int[] a){
        for (int i = 0; i < a.length; i++) {
            //find max item in remaining array and swap
            for (int j = 0; j < a.length-i; j++) {
              int max=getMax(a,i,a.length-i);
              swap(a[j],max);
            }
        }
    }

    private static void swap(int i, int max) {
    }

    private static int getMax(int[] z,int x, int y) { 
        int max=-111;
        for (int i = x; i < y; i++) {
           
            if(max<z[i])max=z[i];

        }
        return max;
    }


}
