package com.DSA;

import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("This is a ");
        list.addFirst("good Boy!");
        list.addLast("bad Boy!");
        System.out.println(list.size());
        System.out.println(list);
    }
}
