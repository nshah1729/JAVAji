package com.DSA.Bitwise.Kunal;
//range for a-->b(both inclusive)
import java.util.Scanner;

public class XORofAllNosBetweenAandB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int ans=xor_ans(a-1)^xor_ans(b);
        System.out.println(ans);
    }

    private static int xor_ans(int a) {
        if(a%4==0)return a;
        if(a%4==1)return 1;
        if(a%4==2)return a+1;
        return 0;
    }
}
