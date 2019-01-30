package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("First in ArrayList");
        list.add("Second in ArrayList");
        list.add("Third in ArrayList");

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

