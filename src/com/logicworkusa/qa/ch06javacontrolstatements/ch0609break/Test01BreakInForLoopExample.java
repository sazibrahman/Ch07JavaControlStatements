package com.logicworkusa.qa.ch06javacontrolstatements.ch0609break;
public class Test01BreakInForLoopExample {

    public static void main(String[] args) {
        // Using break to terminate a for loop
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Breaks out of the loop when i is 3
            }
            System.out.println("Value of i: " + i);
        }
    }
}
