package com.ClassObjectInterface;

public class ClassImplementsInterface implements Interface{


    @Override
    public void printPhrase() {
        System.out.println("Print random phrase 2");
    }

    @Override
    public String returnDayNameByNum(int numOfDay) {
        return EnumDaysOfWeek.getName(numOfDay);
    }

    @Override
    public int returnDayNumByName(String name) {
        return EnumDaysOfWeek.getNumber(name);
    }
}
