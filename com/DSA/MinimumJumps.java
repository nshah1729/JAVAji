package com.DSA;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] a={1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minimumJumps(a));
    }

    private static int minimumJumps(int[] a) {
      int k,min_jumps=0,counter=0;
      while(counter<=a.length){
          int i=0;
          k=a[i];
          counter+=k;
          if(k==0)return -1;
          min_jumps++;
      }
      return min_jumps;
    }
}
