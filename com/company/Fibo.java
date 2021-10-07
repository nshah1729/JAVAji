package com.company;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n){
        int a=0,b=1,count=0;
        int sum=0;//For returning the Fibonacci number.
        while(count<n){
            sum+=a+b;
            int temp=b;
            b=sum;
            a=temp;
            count++;
        }
        return sum;
    }
}
