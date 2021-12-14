package com.DSA;
//Identify if the array contains Duplicate Elements of Array.
//https://leetcode.com/problems/contains-duplicate/
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the ELements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        if(dup(a)) System.out.println("Yes,Duplicate hain!");
        else{
            System.out.println("Duplicate nahin hain!");
        }
        int[] b={1,2,3,4};
        int[] c=runningSum(b);
        System.out.println(Arrays.toString(c));
    }

     static boolean dup(int[] nums) {
         boolean ans=false;
         for(int i=0;i<nums.length;i++){
             int k=0,elementAtIndex=nums[i];
             for(int j=i+1;j<nums.length;j++){
                 if(nums[j]==elementAtIndex){
                     ans=true;
                     break;
                 }
             }
         }
         return ans;
    }
    public static int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}
