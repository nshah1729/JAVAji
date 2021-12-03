package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D ARRAY
        int[][] ros = new int[3][3];

        //INPUT:
        //==================
        //For Rows
        for (int row = 0; row < ros.length; row++) {

            //For Columns
            for (int col = 0; col < ros[row].length; col++) {
                ros[row][col] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.toString(ros));
        for (int row = 0; row < ros.length; row++) {
            System.out.println(Arrays.toString(ros[row]));
        }
        // For Output
        // For Rows
        for (int row = 0; row < ros.length; row++) {

            //For Columns
            for (int col = 0; col < ros[row].length; col++) {
                System.out.print(ros[row][col] + " ");
            }
            System.out.println();
//        }
        }
    }
}
