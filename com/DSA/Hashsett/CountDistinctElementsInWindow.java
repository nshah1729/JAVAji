package com.DSA.Hashsett;

import java.util.HashSet;

//Count the number of Distinct Elements  int the given Window
public class CountDistinctElementsInWindow {
    public static void main(String[] args) {
        int[] a={1,2,2,1,3,1,1,3};
        check(a,4);
    }

                 //////////////////////////
                /////Brute Force-O(n²)////
               //////////////////////////
    public static void check(int[] a,int k){
        for (int i = 0; i < a.length-3; i++) {
            HashSet<Integer> temp=new HashSet<>();
            for (int j = i; j < i+4; j++) {
                temp.add(a[j]);
            }
            System.out.println(temp.size());
        }
    }

                 ////////////////////////
                ///Using HashMaps-O(n²)/
               ////////////////////////
    public static void checkUsingHashMap(int[] a,int k){

    }
}
