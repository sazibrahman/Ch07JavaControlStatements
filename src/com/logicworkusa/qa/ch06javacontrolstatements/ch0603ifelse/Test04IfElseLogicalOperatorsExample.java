package com.logicworkusa.qa.ch06javacontrolstatements.ch0603ifelse;
public class Test04IfElseLogicalOperatorsExample {

    public static void main(String[] args) {
        // Using logical operators in if-else to determine loan eligibility
        int income = 50000;
        int creditScore = 700;

        if (income > 40000 && creditScore > 650) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("Sorry, you are not eligible for the loan.");
        }
    }
}
