package com.logicworkusa.qa.ch06javacontrolstatements.ch0604switch;
public class Test01SwitchIntegerExample {

    public static void main(String[] args) {
        // Using switch with integers to print the day of the week
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}
