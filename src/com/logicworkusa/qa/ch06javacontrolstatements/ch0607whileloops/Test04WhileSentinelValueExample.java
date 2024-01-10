package com.logicworkusa.qa.ch06javacontrolstatements.ch0607whileloops;
import java.util.Scanner;

public class Test04WhileSentinelValueExample {

    public static void main(String[] args) {
        // While loop with a sentinel value to terminate input
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter numbers to sum up (enter 0 to finish):");
        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
