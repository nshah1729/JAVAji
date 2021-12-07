package com.DSA;
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        int[][] ar={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    int t=2;
        System.out.println(Arrays.toString(bin(ar,t)));
    }
    static int[] bin(int[][] a,int target){
        int r=0,c=a.length-1;
        while(r<a.length&&c>=0){
           if(a[r][c]==target)return new int[]{r,c};
           else if(a[r][c]>target)c--;
           else{r++;}
        }
        return new int[]{-1,-1};
    }
}