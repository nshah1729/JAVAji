package com.DSA.Bitwise.Kunal;

/*Given an n x n binary matrix image, flip the image horizontally,
then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
https://leetcode.com/problems/flipping-an-image/
*/

public class FlippingAndInverting2DMatrix {
    public static void main(String[] args) {

    }
    static int[][] flipAndInvert(int[][] a){
        for(int[] row:a){
            //reverse this array
            for (int i = 0; i < (a[0].length+1)/2; i++) {
                //swap
                int temp=row[i]^1;
                row[i]=row[a[0].length-i+1]^1;
                row[a[0].length-i+1]=temp;
            }
        }
        return a;
    }
}
