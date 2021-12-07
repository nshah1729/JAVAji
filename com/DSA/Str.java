package com.DSA;

import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i <5; i++) {
            a[i]=sc.nextInt();
        }
        rev(a);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int[] x){
//        int[] a=new int[x.length];
        int s=0,e=x.length-1;
        while(s<e){
            int temp=x[s];
            x[s]=x[e];
            x[e]=temp;
            s++;e--;
        }
    }
}
