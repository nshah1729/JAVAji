package com.DSA.Bitwise;

public class EveryElementRepeatsTwiceExceptTwoElements {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,4,5,5,6};
        PrintUnique(a);
    }
    public static void PrintUnique(int[] a){
        int XOR=0,XOR_1=0,XOR_2=0,count=0;
        for(int x:a){
            XOR=XOR^x;
        }
        while(XOR!=0){
            if((XOR&1)>0)break;
            count++;
            XOR=XOR>>1;
        }
        for(int x:a){
            if((x&(1<<count))!=0)XOR_1=XOR_1^x;
            else {
                XOR_2=XOR_2^x;
            }
        }
        System.out.println(XOR_1+" "+XOR_2);
    }
}
