package com.logicworkusa.qa.ch06javacontrolstatements.ch0606foreachloops;
public class Test01ForEachArrayExample {

    public static void main(String[] args) {
        // Using for-each loop to iterate through an array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
