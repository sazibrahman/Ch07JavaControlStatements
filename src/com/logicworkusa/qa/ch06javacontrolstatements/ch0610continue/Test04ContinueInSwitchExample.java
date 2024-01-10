package com.logicworkusa.qa.ch06javacontrolstatements.ch0610continue;
public class Test04ContinueInSwitchExample {

    public static void main(String[] args) {
        // Using continue to skip printing certain cases in a switch statement
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                continue; // This would cause a compilation error, continue cannot be used in a switch statement
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
        }
    }
}
