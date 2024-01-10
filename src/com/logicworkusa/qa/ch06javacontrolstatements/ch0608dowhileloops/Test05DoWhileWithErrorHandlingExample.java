package com.logicworkusa.qa.ch06javacontrolstatements.ch0608dowhileloops;
import java.util.Scanner;

public class Test05DoWhileWithErrorHandlingExample {

    public static void main(String[] args) {
        // Do-while loop with error handling for user input
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            try {
                System.out.print("Enter a valid number: ");
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (true);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
