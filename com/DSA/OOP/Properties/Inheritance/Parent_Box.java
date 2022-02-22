package com.DSA.OOP.Properties.Inheritance;

public class Parent_Box {
    int l,w,h;

    public Parent_Box() {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    Parent_Box(int side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Parent_Box(Parent_Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public Parent_Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
