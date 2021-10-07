//package com.company;
//
//import java.util.Arrays;
//
//public class BubbleSort {
//    public static void main(String[] args) {
//        int[] b={5,2,6,7};
//        bubble(b);
//        System.out.println(Arrays.toString(b));
//    }
//    static void bubble(int[] a){
//        //The outer loop will run (n-1) times
//        for(int i=0;i<a.length;i++){
//            //for each iteration the max will come at the last respective index
//            for(int j=1;j<(a.length)-i;j++){
//                //Swap if the item is les than the previous item
//                if(a[j]<a[j-1]){
//                    //Swap
//                    int temp=a[j];
//                    a[j]=a[j-1];
//                    a[j-1]=temp;
//                }
//            }
//        }
//    }
//}

//👇👇👇Another WAY to do👇👇👇
package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] b={5,2,-6,-44,-22,-524,65,874,-1,1,2,5,33,44};
        bubble(b);
        System.out.println(Arrays.toString(b));
    }
    static void bubble(int[] a){
        //The outer loop will run (n-1) times
        for(int i=a.length-1;i>=0;i--){
            //for each iteration the max will come at the last respective index
            for(int j=0;j<i;j++){
                //Swap if the item is les than the previous item
                if(a[j+1]<a[j]){
                    //Swap
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
