package org.example.class6;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

class PersonClass {
    private String name;
    private int age;

    public PersonClass(String name, int age) {
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
        return name + " (" + age + ")";
    }
}

public class CollectorsExample19 {
    public static void main(String[] args) {
        List<PersonClass> people = List.of(
                new PersonClass("Alice", 25),
                new PersonClass("Bob", 30),
                new PersonClass("Charlie", 28),
                new PersonClass("David", 35)
        );

        // Collecting elements into a list
        List<PersonClass> personList = people.stream()
                .collect(Collectors.toList());

        System.out.println("List of People:");
        System.out.println(personList);

        // Collecting elements into a set
        Set<PersonClass> personSet = people.stream()
                .collect(Collectors.toSet());

        System.out.println("Set of People:");
        System.out.println(personSet);

        // Collecting elements into a map (name as key)
        Map<String, PersonClass> personMap = people.stream()
                .collect(Collectors.toMap(PersonClass::getName, person -> person));

        System.out.println("Map of People (name as key):");
        System.out.println(personMap);

        // Joining names of people into a single string
        String names = people.stream()
                .map(PersonClass::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Joined Names: " + names);

        // Grouping people by age
        Map<Integer, List<PersonClass>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(PersonClass::getAge));

        System.out.println("People Grouped by Age:");
        System.out.println(peopleByAge);
    }
}
