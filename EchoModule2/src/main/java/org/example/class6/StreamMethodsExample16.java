package org.example.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class StreamMethodsExample16 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90.0));
        students.add(new Student("Bob", 75.5));
        students.add(new Student("Charlie", 85.0));
        students.add(new Student("David", 92.5));
        students.add(new Student("Eva", 78.0));

        // Stream creation
        Stream<Student> streamOfStudents = students.stream();

        // Filtering - Scores greater than or equal to 80
        Stream<Student> highScorers = streamOfStudents.filter(student -> student.getScore() >= 80);

        // Mapping - Names of high scorers
        Stream<String> namesOfHighScorers = highScorers.map(Student::getName);

        // Collecting names to a list
        List<String> highScorerNames = namesOfHighScorers.collect(Collectors.toList());
        System.out.println("Names of High Scorers: " + highScorerNames);

        // Stream creation (again, since stream can only be consumed once)
        Stream<Student> newStreamOfStudents = students.stream();

        // Averaging scores
        OptionalDouble averageScore = newStreamOfStudents.mapToDouble(Student::getScore).average();
        System.out.println("Average Score: " + averageScore.orElse(0.0));

        // Finding operations
        Optional<Student> firstHighScorer = students.stream().filter(student -> student.getScore() >= 80).findFirst();
        System.out.println("First High Scorer: " + firstHighScorer.orElse(null));

        // Counting high scorers
        long highScorerCount = students.stream().filter(student -> student.getScore() >= 80).count();
        System.out.println("High Scorer Count: " + highScorerCount);

        // Any match - Are there any perfect scorers?
        boolean anyPerfectScorer = students.stream().anyMatch(student -> student.getScore() == 100);
        System.out.println("Any Perfect Scorer? " + anyPerfectScorer);
    }
}
