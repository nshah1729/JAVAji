package com.DSA;

import java.util.*;

public class ArrayListFunctions {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        ArrayList<Integer> myList=new ArrayList<Integer>();
        //add elements
        myList.add(1);
        myList.add(2);
        myList.add(3);

        //get elements
        System.out.println(myList.get(1));

        System.out.println(myList);
        //add element in between
        myList.add(1,8);
        System.out.println(myList);

        //set element
        myList.set(1,6);
        System.out.println(myList);

        //remove element
        myList.remove(3);
        System.out.println(myList);

        //size
        System.out.println(myList.size());

        //sorting
        Collections.sort(myList);
        System.out.println(myList);
    }
}
