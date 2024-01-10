package com.logicworkusa.qa.ch06javacontrolstatements.ch0605forloops;
public class Test04ForLoopSkippingExample {

    public static void main(String[] args) {
        // For loop skipping even numbers between 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
