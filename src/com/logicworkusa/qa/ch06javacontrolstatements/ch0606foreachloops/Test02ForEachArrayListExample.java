package com.logicworkusa.qa.ch06javacontrolstatements.ch0606foreachloops;
import java.util.ArrayList;
import java.util.List;

public class Test02ForEachArrayListExample {

    public static void main(String[] args) {
        // Using for-each loop to iterate through an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
