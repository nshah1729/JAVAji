package com.DSA.KKRecursion;

public class PrintingMessageUsingRecursionOptimised {
    public static void main(String[] args) {
        //Write a Recursive Function that prints hello World!
        print(1);
}
    public static void print(int a){
        System.out.println(a);
        if(a==5)return;
        print(a+1);
    }
}
