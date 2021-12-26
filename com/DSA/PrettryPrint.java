package com.DSA;

import java.util.ArrayList;

public class PrettryPrint {
    public static void main(String[] args) {
        float n=12.3244f;
//        System.out.printf("Formatted is: %.2f",n);
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                char chi = (char) ('a' + j);
                str.append(chi);
            }
        System.out.println(str);
        }
}
