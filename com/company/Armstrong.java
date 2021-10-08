package com.company;
//Printing Armstrong numbers between a range
public class Armstrong {
    public static void main(String[] args) {
        int a=10,b=2000000;
        for (int i = a; i < b; i++) {
            if(arm(i)) System.out.println(i+" ");

        }
    }
    //Function to check Armstrong numbers.
     public static boolean arm(int n){
        int s=0,p=n;
        while(n>0){
            s+=Math.pow(n%10,3);
            n/=10;
        }
        if(s==p)return true;
        return false;
    }
}
