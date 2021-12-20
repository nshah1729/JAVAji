package com.DSA;

import java.util.Scanner;

public class SqaureRootUsingSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= sc.nextInt();
        if(find(a)!=-1) System.out.println( " Square is: "+find(a));
    }
    public static int find(int a){
        if(a==1||a==0)return a;
        //For Rest of the Cases:
        int s=0,e=a;
        while(s<e){
            int m=(s+e)/2;
            int square=m*m;
            if(square==a)return (int)m;
            if(square>a){e=(int)m-1;}
            else{s=(int)m+1;}
        }
        return -1;
    }
}
