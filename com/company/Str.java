package com.company;

import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i < Math.min(a, b); i++) {
            if ((a % i == 0) && (b % i == 0)) count++;
        }
        System.out.println(count);
    }
}
