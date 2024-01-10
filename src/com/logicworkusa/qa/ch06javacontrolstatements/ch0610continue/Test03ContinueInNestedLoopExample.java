package com.logicworkusa.qa.ch06javacontrolstatements.ch0610continue;
public class Test03ContinueInNestedLoopExample {

    public static void main(String[] args) {
        // Using continue to skip printing numbers divisible by 2 in nested loops
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j % 2 == 0) {
                    continue; // Skips even numbers in the inner loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
