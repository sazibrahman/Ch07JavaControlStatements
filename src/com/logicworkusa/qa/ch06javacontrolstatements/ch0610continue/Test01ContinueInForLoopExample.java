package com.logicworkusa.qa.ch06javacontrolstatements.ch0610continue;
public class Test01ContinueInForLoopExample {

    public static void main(String[] args) {
        // Using continue to skip printing even numbers in a for loop
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; // Skips even numbers in the loop
            }
            System.out.println("Value of i: " + i);
        }
    }
}
