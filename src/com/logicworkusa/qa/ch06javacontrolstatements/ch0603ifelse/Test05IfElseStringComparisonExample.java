package com.logicworkusa.qa.ch06javacontrolstatements.ch0603ifelse;
public class Test05IfElseStringComparisonExample {

    public static void main(String[] args) {
        // Comparing strings using if-else
        String day = "Tuesday";

        if (day.equals("Monday")) {
            System.out.println("It's the start of the week.");
        } else if (day.equals("Tuesday")) {
            System.out.println("It's the second day of the week.");
        } else {
            System.out.println("It's neither Monday nor Tuesday.");
        }
    }
}
