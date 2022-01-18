package kk.BitWiseManipulation;

import java.util.Scanner;

//If n=5...then output is value of 1^2^3^4^5
public class FindXORfromZeroToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        valueofXOR(n);
    }

    //Find a Repeating Pattern.
    private static void valueofXOR(int n) {   //O(1);
        if(n%4==0) System.out.println("The XOR value is: "+n);
        if(n%4==1) System.out.println("The XOR value is: "+1);
        if(n%4==2) System.out.println("The XOR value is: "+n+1);
        if(n%4==3) System.out.println("The XOR value is: "+0);
    }
}
