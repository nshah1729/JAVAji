package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the operator: ");
            char a=sc.next().trim().charAt(0);
            System.out.println();
            if(a=='+'||a=='-'||a=='/'||a=='%'||a=='*'){
                System.out.print("Enter two numbers: ");
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println();
                if(a=='+')ans=x+y;
                if (a=='-')ans=x-y;
                if (a=='/')ans=x/y;
                if (a=='*')ans=x*y;
                if (a=='%')ans=x%y;
                else if(a=='x'||a=='X')break;
                else {
                    System.out.println("Enter a valid operator");
                }
            }
            System.out.println(ans);
        }
    }
}
