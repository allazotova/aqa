package com.homework1;

public class Task4 {
    public static void main(String[] args) {

        int[] array = {
                10, 44, 45, 2
        };

        if (array[0] % 2 == 0) {
            System.out.println(array[0]);
        }
        if (array[1] % 2 == 0) {
            System.out.println(array[1]);
        }
        if (array[2] % 2 == 0) {
            System.out.println(array[2]);
        }
        if (array[3] % 2 == 0) {
            System.out.println(array[3]);
        } else {
            System.err.println("There is no even numbers");
        }
    }
}