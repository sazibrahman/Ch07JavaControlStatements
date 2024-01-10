package com.logicworkusa.qa.ch06javacontrolstatements.ch0609break;
public class Test03BreakInNestedLoopExample {

    public static void main(String[] args) {
        // Using break to terminate a nested loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break; // Breaks out of the inner loop when i is 2 and j is 2
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
