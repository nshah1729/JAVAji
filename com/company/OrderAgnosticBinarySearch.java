package com.company;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }//Array Input

        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        boolean isAsc=a[0]<a[a.length-1];
        if(search(a,target,isAsc)==-1) System.out.println("Element not found!");
        else{
            System.out.println(search(a,target,isAsc)+1+"th index");
        }

    }
    static int search(int[] a,int target,boolean isAsc){
        int s=0,e=a.length-1;

        while(s<=e){

            int m=(s+e)/2;
            if(a[m]==target){
                return m;
            }//If the Element is Found!

            if(isAsc){
                 if(target>a[m]){
                    s=m+1;
                }
                else {
                    e=m-1;
                }
            }//For Ascending order Array

            else{
                if(target>a[m]){
                    e=m-1;
                }
                else {
                    s=m+1;
                }
            }//For Descending order Array

        }
        return -1;
    }
}
