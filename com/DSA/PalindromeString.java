package com.DSA;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        if(!check(str)) System.out.println("The String is not Palindrome");
        else {
            System.out.println("The String is Palindrome");
        }if(!isPal(str)) System.out.println("The String is not Palindrome");
        else {
            System.out.println("The String is Palindrome");
        }
    }
    //Function 1:
    private static boolean check(String str) {
        str=str.toLowerCase();
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)==str.charAt(e)){
                s++;e--;
            }
            else return false;
        }
        return true;
    }
    //Function 2:
    private static boolean isPal(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char s=str.charAt(i);
            char e=str.charAt(str.length()-1-i);
            if(s!=e)return false;
        }
        return true;
    }
}
