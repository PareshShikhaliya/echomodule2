package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }
}

public class PersonSortingExample12 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 40));
        people.add(new Person("David", 28));

        // Using method reference for comparison
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Collections.sort(people, ageComparator);

        // Print the sorted list
        people.forEach(System.out::println);
    }
}
