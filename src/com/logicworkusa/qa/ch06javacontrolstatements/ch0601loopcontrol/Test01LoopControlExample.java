package com.logicworkusa.qa.ch06javacontrolstatements.ch0601loopcontrol;
public class Test01LoopControlExample {

    public static void main(String[] args) {

        // Example of a for loop
        System.out.println("Example of a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }
        
        // Example of a while loop
        System.out.println("\nExample of a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count is: " + j);
            j++;
        }
        
        // Example of a do-while loop
        System.out.println("\nExample of a do-while loop:");
        int k = 1;
        do {
            System.out.println("Count is: " + k);
            k++;
        } while (k <= 5);

        // Example of break statement
        System.out.println("\nExample of a break statement:");
        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                break; // Breaks out of the loop when x equals 6
            }
            System.out.println("Value of x: " + x);
        }

        // Example of continue statement
        System.out.println("\nExample of a continue statement:");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue; // Skips printing when y equals 3
            }
            System.out.println("Value of y: " + y);
        }
    }
}
