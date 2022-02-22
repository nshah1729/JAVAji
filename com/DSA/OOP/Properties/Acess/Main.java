package com.DSA.OOP.Properties.Acess;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Access obj=new Access(10,"Krishna");
        System.out.println(Arrays.toString(obj.a));
        obj.setNum(39);//Setting
        System.out.println(obj.getget());//Getting & Printing
    }
}
