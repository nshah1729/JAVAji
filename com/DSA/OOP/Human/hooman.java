package com.DSA.OOP.Human;

public class hooman {
    int age;
    String name;
    static long population;
    hooman(String name,int age){
        this.age=age;
        this.name=name;
        population+=1;
    }
}
