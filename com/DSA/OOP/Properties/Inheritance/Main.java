package com.DSA.OOP.Properties.Inheritance;


public class Main {
    public static void main(String[] args) {
        Parent_Box box=new Parent_Box(3,2,3);
        Parent_Box box2=new Parent_Box(box);

//        System.out.println(box.h+" | "+box.l+" | "+box.w+" ");

        BoxWeight box3=new BoxWeight(1,2,3,4);
        System.out.println(box3.h);
        System.out.println(box3.weight);

    }
}
