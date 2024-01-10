package com.logicworkusa.qa.ch06javacontrolstatements.ch0605forloops;
public class Test02ForLoopArrayExample {

    public static void main(String[] args) {
        // Using for loop to iterate through an array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }
    }
}
