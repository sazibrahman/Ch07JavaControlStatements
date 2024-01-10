package com.logicworkusa.qa.ch06javacontrolstatements.ch0606foreachloops;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Test05ForEachCustomObjectExample {

    public static void main(String[] args) {
        // Using for-each loop with a list of custom objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice"));
        people.add(new Person("Bob"));
        people.add(new Person("Charlie"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
