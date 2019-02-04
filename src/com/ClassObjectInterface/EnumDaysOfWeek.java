package com.ClassObjectInterface;

public enum EnumDaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int number;


    EnumDaysOfWeek(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static String getName(int weekNumber) {
        //return this.name;
        switch (weekNumber) {

            case 1:
                return MONDAY.name;
            case 2:
                return TUESDAY.name;
            case 3:
                return WEDNESDAY.name;

        }
        return "no such day";
    }
    public static int getNumber(String weekName) {
        //return this.name;
        switch (EnumDaysOfWeek.valueOf(weekName.toUpperCase())) {

            case MONDAY:
                return MONDAY.number;
            case TUESDAY:
                return TUESDAY.number;
            case WEDNESDAY:
                return WEDNESDAY.number;

        }
        return -1;
    }
}
