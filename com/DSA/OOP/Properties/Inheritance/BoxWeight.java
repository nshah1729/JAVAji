package com.DSA.OOP.Properties.Inheritance;

public class BoxWeight extends Parent_Box{
    int weight;

    public BoxWeight() {
        this.weight = -1;
    }
    public BoxWeight(int l,int w,int h,int weight){
        super(l,w,h);
        this.weight=weight;
    }
}
