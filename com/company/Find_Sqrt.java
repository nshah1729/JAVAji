package com.company;

import java.util.Scanner;

public class Find_Sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("The Square root of the number is: "+sq(a));
    }
    static int sq(int n){
        return (int)(Math.sqrt(n));
    }
}
