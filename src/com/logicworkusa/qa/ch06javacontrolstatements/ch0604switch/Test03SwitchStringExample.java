package com.logicworkusa.qa.ch06javacontrolstatements.ch0604switch;
public class Test03SwitchStringExample {

    public static void main(String[] args) {
        // Using switch with strings to perform actions based on user input
        String choice = "Red";

        switch (choice) {
            case "Red":
                System.out.println("You chose red.");
                break;
            case "Blue":
                System.out.println("You chose blue.");
                break;
            case "Green":
                System.out.println("You chose green.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
