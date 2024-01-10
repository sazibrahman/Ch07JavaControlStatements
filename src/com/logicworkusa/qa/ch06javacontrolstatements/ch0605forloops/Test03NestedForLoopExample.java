package com.logicworkusa.qa.ch06javacontrolstatements.ch0605forloops;
public class Test03NestedForLoopExample {

    public static void main(String[] args) {
        // Nested for loops to create a simple pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
