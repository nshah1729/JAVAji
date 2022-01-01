package com.DSA.Bitwise;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= {7,8,3,1,2};
//        System.out.println("Enter the Elements of the array:");
//        for (int i = 0; i < 10; i++) {
//            a[i]=sc.nextInt();
//        }
        System.out.println("The Sorted array is: ");
        bubble(a);
        System.out.println(Arrays.toString(a));
//        System.out.println(selection(a));
//        System.out.println(insertion(a));

    }

    private static int[] bubble(int[] a) {
        for (int i = a.length-1; i >=0; i--) {
            for (int j = 0; j < a.length-i; j++) {
                if(a[j]>a[j+1])swap(a,j,j+1);
            }
        }
        return a;
    }
    private static void swap(int[] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

//    private static int[] selection(int[] a) {
//
//    }
//
//    private static int[] insertion(int[] a) {
//
//
//    }
}
