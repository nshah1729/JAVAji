package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] a=new int[5];
        for (int i = 0; i <a.length; i++) {
            a[i]= sc.nextInt();
        }
       rev(a);
        System.out.println(Arrays.toString(a));
    }

    static void rev(int[] a) {
        int s=0,e=a.length-1;
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;e--;
        }
    }
}
