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
        for (int j = 0; j <a.length-1; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if(a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j]=temp;
                }
            }
        }
        return a;
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
