package com.logicworkusa.qa.ch06javacontrolstatements.ch0610continue;
public class Test02ContinueInWhileLoopExample {

    public static void main(String[] args) {
        // Using continue to skip numbers divisible by 3 in a while loop
        int i = 0;
        while (i < 5) {
            i++;
            if (i % 3 == 0) {
                continue; // Skips numbers divisible by 3
            }
            System.out.println("Value of i: " + i);
        }
    }
}
