package com.logicworkusa.qa.ch06javacontrolstatements.ch0602decisionmaking;
public class Test05TernaryOperatorExample {

    public static void main(String[] args) {
        // Example of a ternary operator to find the maximum of two numbers
        int num1 = 25;
        int num2 = 30;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is: " + max);
    }
}
