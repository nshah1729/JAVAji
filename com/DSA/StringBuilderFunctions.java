package com.DSA;

public class StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Krishna");
        System.out.println(str);

        //char at index:0
        System.out.println(str.charAt(0));

        //set character at index
        str.setCharAt(0,'T');
        System.out.println(str);

        //Inserting a character in between
        str.insert(0,'r');
        System.out.println(str);
    }
}
