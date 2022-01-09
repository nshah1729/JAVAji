package com.DSA;

//Find Duplicate Number and Missing Number from 1 to N
public class OneRepeatOneMiss {
    public static void main(String[] args) {
        int[] a={7,1,3,4,5,1,6,2};
        check(a);
        check(new int[]{3,1,3});
    }
    public static void check(int[] a){

        //T.C : O(n)

        int xor=0;
        for(int x:a)xor^=x;
        for (int i = 1; i <= a.length; i++) xor^=i;
        int x=0,y=0;
        int rsb=xor&-xor;//Right-most set bit
        for (int i = 0; i < a.length; i++) {
            if((a[i]&rsb)>0)x^=a[i];
            else y^=a[i];
        }
        for (int i = 1; i <= a.length; i++){
            if((i&rsb)>0)x^=i;
            else y^=i;
        }
        for(int val:a){
            if(val==x){
                System.out.println("Repeating number --> "+x);
                System.out.println("Missing number --> "+y+'\n');
                System.out.println("=========================");
                break;
            }
            else if(val==y){
                System.out.println("Repeating number --> "+y);
                System.out.println("Missing number --> "+x+'\n');
                System.out.println("=========================");
                break;
            }
        }
    }
}
