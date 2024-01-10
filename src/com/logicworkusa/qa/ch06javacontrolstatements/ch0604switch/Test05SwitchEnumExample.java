package com.logicworkusa.qa.ch06javacontrolstatements.ch0604switch;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Test05SwitchEnumExample {

    public static void main(String[] args) {
        // Using switch with enums to handle different days
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
