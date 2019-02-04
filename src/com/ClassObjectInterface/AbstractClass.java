package com.ClassObjectInterface;

public abstract class AbstractClass {


    public AbstractClass(int numOfMonth) {
    }

    abstract void printPhrase();

    public enum EnumMonthesOfTheYear{
        JANUARY("JANUARY", 1),
        FEBRUARY("FEBRUARY",2),
        MARCH("MARCH",3),
        ;

        EnumMonthesOfTheYear(String month, int number) {

        }
    }
    String getMonthNameByNum(int numOfMonth){

            //return this.name;
            switch (numOfMonth) {

                case 1:
                    return EnumMonthesOfTheYear.JANUARY.name();
                case 2:
                    return EnumMonthesOfTheYear.FEBRUARY.name();
                case 3:
                    return EnumMonthesOfTheYear.MARCH.name();

            }
            return "no such day";
        }

}