package com.homework1;

public class Task2 {

    public static void main(String[] args) {
        int varInt = 24234234;
        double varDouble;
        String varString;

        varString= String.valueOf(varInt);
        System.out.println("String value is: "+ varString);

        varDouble = Double.parseDouble(varString);
        System.out.println(varDouble);

        varInt =  (int) varDouble;
        System.out.println(varInt);

    }



}
