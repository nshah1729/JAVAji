package com.DSA.Hashsett;

import java.util.HashSet;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={23,53,52,3,4,5,6};
        HashSet<Integer> ans=new HashSet<>();
        for(int x:a)ans.add(x);
        int count=0;
        for(int x:b){
            if(ans.contains(x)){
                count++;
                ans.remove(x);
            }
        }
        System.out.println("The Number of Commmon elements are "+count);
        HashMap<Integer,Integer> j=new HashMap<>();
    }
}
