package com.logicworkusa.qa.ch06javacontrolstatements.ch0606foreachloops;
import java.util.HashSet;
import java.util.Set;

public class Test04ForEachIterableExample {

    public static void main(String[] args) {
        // Using for-each loop with a Set (Iterable object)
        Set<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("UK");

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
