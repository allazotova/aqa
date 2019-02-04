package com.ClassObjectInterface;

public class Runner {
    public static void main(String[] args) {
        Interface obj1 = new ClassImplementsInterface();

        System.out.println( obj1.returnDayNameByNum(1));
        System.out.println( obj1.returnDayNumByName("Monday"));

        ClassImplementsAbstractClass obj2 = new ClassImplementsAbstractClass(3);
        System.out.println(obj2.getMonthNameByNum(1));
        obj2.printPhrase();

        obj1.printPhrase();
    }
}
