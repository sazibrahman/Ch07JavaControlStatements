package com.logicworkusa.qa.ch06javacontrolstatements.ch0604switch;
public class Test04SwitchWithoutBreakExample {

    public static void main(String[] args) {
        // Switch without breaks causing fall-through behavior
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Number is 1.");
            case 2:
                System.out.println("Number is 2.");
            case 3:
                System.out.println("Number is 3.");
            default:
                System.out.println("Out of range.");
        }
    }
}
