package com.DSA.Bitwise;

//In converting a-->b, we need to find how many bits are to be changed:
import java.util.Scanner;

public class ConvertAtoBNoOfBitsChanged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        System.out.println("No of bits required to be changed is "+noOfBitsChanged(a,b));
    }
    //Function to do the Task:
    private static int noOfBitsChanged(int a, int b) {
        int xor_value=a^b;
        int count=0;
        while (xor_value>0){
            if((xor_value&1)==1)count++;
            xor_value=xor_value>>1;
        }
        return count;
    }
}
