package com.DSA.OOP.Properties.Acess;
import java.util.*;
public class Access {
   private int num;
    String name;
    int[] a;

    public int getget(){
       return getNum();
    }
    private int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
        this.a = new int[num];
    }
}
