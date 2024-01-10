package com.logicworkusa.qa.ch06javacontrolstatements.ch0609break;
public class Test05BreakInInfiniteLoopExample {

    public static void main(String[] args) {
        // Using break to exit an infinite loop based on a condition
        int i = 1;

        while (true) {
            if (i == 5) {
                break; // Breaks out of the loop when i is 5
            }
            System.out.println("Value of i: " + i);
            i++;
        }
    }
}
