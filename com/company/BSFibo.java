package com.company;

import java.util.Scanner;

public class BSFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,7,9,11,23,45};
        int ans=BS(a,12,0,8);
        System.out.println(ans);
    }
    static int BS(int[] arr,int target,int s,int e){
        if(s>e)return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)return m;
        if(arr[m]>target)return BS(arr,target,s,m-1);
        else{return BS(arr,target,m+1,e);}
    }
}
