package com.company;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n){
        int a=0,b=1,count=0;
         int ans=0;
        while(count<n){
            int sum=0;
           sum+=a+b;
            int temp=b;
            b=sum;
            a=temp;
            count++;
            ans=b;
        }
        return ans;
    }
}
