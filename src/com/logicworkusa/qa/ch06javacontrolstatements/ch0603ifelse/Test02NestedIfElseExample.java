package com.logicworkusa.qa.ch06javacontrolstatements.ch0603ifelse;
public class Test02NestedIfElseExample {

    public static void main(String[] args) {
        // Nested if-else to check eligibility based on age and citizenship
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            if (isCitizen) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must be a citizen to vote.");
            }
        } else {
            System.out.println("You must be at least 18 years old to vote.");
        }
    }
}
