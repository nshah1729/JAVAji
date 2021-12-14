package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of extra candies");
        int extraCandies=sc.nextInt();
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        int[] candies=new int[n];
        System.out.println("Enter the number of candies each kid has");
        for (int i = 0; i < candies.length; i++) {
            candies[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(resu(candies,extraCandies)));
    }

    private static boolean[] resu(int[] candies, int extraCandies) {
        boolean[] ans=new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {

            int temp=candies[i]+extraCandies,k=0;

            for (int j = 0; j < candies.length; j++) {
                if(candies[j]>temp){
                    ans[i]=false;break;
                }
                else{k++;}
            }
            if(k==candies.length)ans[i]=true;
        }
        return ans;
    }

}
