package com.logicworkusa.qa.ch06javacontrolstatements.ch0607whileloops;
public class Test05WhileConditionalLogicExample {

    public static void main(String[] args) {
        // While loop using conditional logic to count down from 5 to 1
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Blastoff!");
    }
}
