package com.DSA.KKRecursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
       int ans= search(a,5,0,a.length-1);
        System.out.println(ans);
    }
    static int search(int[] a,int target,int s,int e){

        if(s>e)return -1;//Element not Found!

            int m=s+(e-s)/2;
            if(a[m]==target)return m;
            if(a[m]>target)return search(a,target,s,m-1);
              return search(a,target,m+1,e);
    }
}
