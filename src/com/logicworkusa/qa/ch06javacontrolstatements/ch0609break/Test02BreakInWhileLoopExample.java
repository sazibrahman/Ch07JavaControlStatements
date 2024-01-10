package com.logicworkusa.qa.ch06javacontrolstatements.ch0609break;
public class Test02BreakInWhileLoopExample {

    public static void main(String[] args) {
        // Using break to terminate a while loop
        int i = 1;
        while (i <= 5) {
            if (i == 4) {
                break; // Breaks out of the loop when i is 4
            }
            System.out.println("Value of i: " + i);
            i++;
        }
    }
}
