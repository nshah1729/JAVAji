package com.DSA.OOP;

import java.util.Arrays;

public class nice {
    public static void main(String[] args) {

        A obj=new A(12);
        System.out.println(obj);

    }
}
class A{
    int age;

    A(int age){
        this.age=age;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Yolo");
    }
}
