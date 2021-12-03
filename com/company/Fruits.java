package com.company;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10,b=20;
        System.out.println(a+" | "+ b);
        swap(a,b);
        System.out.println(a+" | "+ b);
    }
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
}
