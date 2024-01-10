package com.logicworkusa.qa.ch06javacontrolstatements.ch0610continue;
public class Test05ContinueInInfiniteLoopExample {

    public static void main(String[] args) {
        // Using continue to skip a specific value in an infinite loop
        int i = 0;

        while (true) {
            i++;
            if (i == 5) {
                continue; // Skips printing 5 in the loop
            }
            System.out.println("Value of i: " + i);
            if (i == 10) {
                break; // Breaks out of the loop when i is 10
            }
        }
    }
}
