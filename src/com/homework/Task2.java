package com.homework;

public class Task2 {

    public static void main(String[] args) {

        int varInt = 24234234;
        double varDouble;
        String varString;

        varString= String.valueOf(varInt);

        varDouble = Double.parseDouble(varString);

        varInt =  (int) varDouble;
        System.out.format("String: %s, Double: %f, Integer: %d",varString,varDouble,varInt);

    }
}
