package com.logicworkusa.qa.ch06javacontrolstatements.ch0607whileloops;
import java.util.Scanner;

public class Test03WhileUserInputExample {

    public static void main(String[] args) {
        // While loop to get user input until the condition is met
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Enter a value (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }

        System.out.println("Exited the loop.");
        scanner.close();
    }
}
