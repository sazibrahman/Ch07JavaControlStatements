package com.logicworkusa.qa.ch06javacontrolstatements.ch0603ifelse;
public class Test03MultipleIfElseExample {

    public static void main(String[] args) {
        // Checking grade based on percentage using multiple if-else
        double percentage = 75.5;
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
