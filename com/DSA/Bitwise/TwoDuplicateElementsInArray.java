package com.DSA.Bitwise;

import java.util.Arrays;

public class TwoDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] a={5,4,1,4,3,5,1,2};
        System.out.println("The Original array is: "+ Arrays.toString(a));
        int[] ans=get(a);
        System.out.print("The Two Non-Repeating elements are: ");
        System.out.print(ans[0]+" and "+ans[1]);
//        System.out.println(Arrays.toString(get(a)));
    }

    //1.First way
    private static int[] get(int[] a) {
        //For Zeroing Duplicates
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if((a[i]^a[j])==0){
                    a[i]=a[j]=0;
                }
            }
        }
        //For finding the non-zero element in the final array
        int[] ans=new int[2];
        int k=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=0){
                ans[k]=a[i];
                k += 1;
            }
        }
        return ans;
    }

    //2.Second Way:
    public static int[] checking(int[] a){
        int aXORb=0;
        for(int val:a){
            aXORb=aXORb^val;
        }
        int rightMostSetBitMask=aXORb&(-aXORb);
        for(int val:a){

        }
        return new int[]{1,2};
    }

}
