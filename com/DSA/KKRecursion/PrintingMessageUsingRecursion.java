package com.DSA.KKRecursion;

public class PrintingMessageUsingRecursion {
    public static void main(String[] args) {
        //Write a Function that prints hello World!
        print();
    }
    public static void print(){
            System.out.println("Hello World!");
            print2();
    }
    public static void print2(){
            System.out.println("Hello World!");
            print3();
    }
    public static void print3(){
            System.out.println("Hello World!");
            print4();
    }
    public static void print4(){
            System.out.println("Hello World!");
        print5();
    }
    public static void print5(){
            System.out.println("Hello World!");
    }
}
