package com.logicworkusa.qa.ch06javacontrolstatements.ch0609break;
public class Test04BreakInSwitchExample {

    public static void main(String[] args) {
        // Using break to exit a switch statement early
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break; // Breaks out of the switch after printing "Number is 2"
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
        }
    }
}
