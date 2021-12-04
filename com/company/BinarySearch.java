package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        if(search(a,target)==-1) System.out.println("Element not found!");
        else{
            System.out.println(search(a,target)+1+"th index");
        }

    }
    static int search(int[] a,int target){
        int s=0,e=a.length-1;

        while(s<=e){

            int m=(s+e)/2;

            if(a[m]==target){
                return m;
            }
            else if(target>a[m]){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return -1;
    }
    }
