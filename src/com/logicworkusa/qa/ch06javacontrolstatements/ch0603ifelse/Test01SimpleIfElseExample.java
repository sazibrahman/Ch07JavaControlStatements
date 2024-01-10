package com.logicworkusa.qa.ch06javacontrolstatements.ch0603ifelse;
public class Test01SimpleIfElseExample {

    public static void main(String[] args) {
        // Simple if-else to check if a number is even or odd
        int number = 15;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
