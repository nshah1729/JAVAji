package com.DSA.Bitwise;

import java.util.Scanner;

public class ExtractingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("The Binary Representation is: ");
        rep(n);
    }

    private static void rep(int n) {
        boolean flag=false;
        for(int i=3;i>=0;i--){
            int mask=n<<i;
            if(flag){ //After we have reached 1
                if((n&mask)!=0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            else{ //Until we have not reached first 1
                if((n&mask)!=0){
                    flag=true;
                    System.out.print(1);
                }
            }
        }
    }
}
