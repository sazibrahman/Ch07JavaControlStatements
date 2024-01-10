package com.logicworkusa.qa.ch06javacontrolstatements.ch0608dowhileloops;
public class Test03DoWhileConditionalLogicExample {

    public static void main(String[] args) {
        // Do-while loop using conditional logic to count down from 5 to 1
        int count = 5;
        do {
            System.out.println(count);
            count--;
        } while (count > 0);
        System.out.println("Blastoff!");
    }
}
