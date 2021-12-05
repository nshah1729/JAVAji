package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchStrictlySortedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a={
//                {10,20,30,40},
//                {50,60,70,80},
//                {90,120,220,290},
//                {333,342,358,505}
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        while(true)
        {
            System.out.println("Enter the number to be searched: ");
            int target=sc.nextInt();
            if(target==0){
                System.out.println("Operation Terminated!");
                break;
            }
            int[] ans=searchMatrix(a,target);
            if(ans[0]==-1&&ans[1]==-1) System.out.println("Element not found!");
            else{
                System.out.println(Arrays.toString(ans));
            }
        }

    }

    static int[] searchMatrix(int[][] a, int target) {
        int row=0,col=a.length-1;
        while(row<a.length&&col>=0){
            if(a[row][col]==target)return new int[]{row,col};
            if(target>a[row][col])row++;
            else col--;
        }
        return new int[]{-1,-1};
    }
}
