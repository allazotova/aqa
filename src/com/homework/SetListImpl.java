package com.homework;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetListImpl {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("pineapple");
        set.add("watermelon");
        set.add("apple");
        set.add("pear");
        set.add("quince");
        set.add("lemon");
        set.add("kiwi");

        LinkedList<String> list = new LinkedList<>();
        list.add("plum");
        list.add("nut");
        list.add("apple");
        list.add("grape");
        list.add("peach");
        list.add("pear");
        list.add("cherry");
        list.add("orange");
        list.add("watermelon");
        list.add("apricot");
        list.add("pineapple");

        System.out.printf("\nSet Before reduce:\n");
        for (String s : set) {
            System.out.println(s);
        }
        set.retainAll(list);
        System.out.printf("\nSet After reduce:\n");

        for (String s : set) {
            System.out.println(s);
        };
        System.out.printf("\nLinkedList:\n");
        for (String l : list) {
            System.out.println(l);
        };

    }
}
