package com.logicworkusa.qa.ch06javacontrolstatements.ch0602decisionmaking;
public class Test03IfElseIfStatementExample {

    public static void main(String[] args) {
        // Example of an if-else-if ladder
        int number = 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
