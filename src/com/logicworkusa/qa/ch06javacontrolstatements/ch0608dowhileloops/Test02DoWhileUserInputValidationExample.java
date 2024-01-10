package com.logicworkusa.qa.ch06javacontrolstatements.ch0608dowhileloops;
import java.util.Scanner;

public class Test02DoWhileUserInputValidationExample {

    public static void main(String[] args) {
        // Do-while loop to validate user input within a range
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}
