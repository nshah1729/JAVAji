package com.company;

public class JustPrint {
    public static void main(String[] args) {
        p(1);
    }
//    static void m(){
//        System.out.print("Hi ");
//        m1();
//    }static void m1(){
//        System.out.print("my ");
//        m2();
//    }static void m2(){
//        System.out.print("name ");
//        m3();
//    }static void m3(){
//        System.out.print("is ");
//        m4();
//    }static void m4(){
//        System.out.print("Nishant!");
//    }
    static void p(int n){
        if(n==4){
            System.out.println(n);
            return;
        }
        System.out.println(n);
            p(n+1);
    }
}
