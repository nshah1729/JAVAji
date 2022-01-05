package com.DSA.Hashsett;
//Count Distinct Elements in an Array!!
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,4,5,2,1,9};
        HashSet<Integer> a=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        System.out.println("The number of Distinct Elements in the array is "+a.size());
        System.out.println("The number of Distinct Elements in the array is "+size(arr));

    }
    public static int size(int[] a){
        int noOfDistinctElements=0;
        for (int i = 0; i < a.length; i++) {
            int count=0;                           ///////////////////////////
            for (int j = 0; j < i; j++) {         ///Time Complexity=O(n²)///
                if(a[j]==a[i])count++;           ///////////////////////////
            }
            if(count==0)noOfDistinctElements++;
        }
        return noOfDistinctElements;
    }
}
