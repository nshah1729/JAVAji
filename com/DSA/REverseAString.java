package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class REverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String str=sc.nextLine();
        char[] ans=rev(str);

        System.out.println(Arrays.toString(ans));
    }

    private static char[] rev(String str) {
        char[] temp=str.toCharArray();
        int s=0,e=temp.length-1;
        while(s<=e){
            char x=temp[s];
            temp[s]=temp[e];
            temp[e]=x;
            s++;e--;
        }
        return temp;
    }
}
