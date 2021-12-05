package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySeatchMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.print("Enter the number to be searched: ");
        int target=sc.nextInt();
        int[] ans=searchMatrix(a,target);
        if(ans[0]==-1&&ans[1]==-1) System.out.println("Element not found!");
        else{System.out.println(Arrays.toString(ans));}
    }
    static int[] searchMatrix(int[][] a,int target){
        int row=0,col=a.length-1;
        while(row<a.length&&col>=0){
            if(a[row][col]==target)return new int[]{row+1,col+1};
            else if(target<a[row][col])col--;
            else{row++;}
        }
        return new int[]{-1,-1};
    }
}
