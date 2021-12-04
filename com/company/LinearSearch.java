package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a= {
                {1,2,35,6,2},
                {1,44,64,67,2},
                {1,44,64,76,856,345},
        };
        System.out.print("Enter the Element to search: ");
        int target= sc.nextInt();
        int[] p=search(a,target);
        if(p[0]>-1&&p[1]>-1) System.out.println(Arrays.toString(p));
        else{
            System.out.println("Element not found\uD83E\uDD27");
        }
    }
    static int[] search(int[][] a,int target){
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if(a[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
