package com.logicworkusa.qa.ch06javacontrolstatements.ch0604switch;
public class Test02SwitchCharExample {

    public static void main(String[] args) {
        // Using switch with characters to determine the grade
        char grade = 'B';
        String remarks;

        switch (grade) {
            case 'A':
                remarks = "Excellent";
                break;
            case 'B':
                remarks = "Good";
                break;
            case 'C':
                remarks = "Average";
                break;
            default:
                remarks = "Needs improvement";
        }

        System.out.println("Your grade is: " + remarks);
    }
}
