package org.example.class6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeClass {
    private String name;
    private int age;
    private String department;

    public EmployeeClass(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old, " + department + ")";
    }
}

public class EmployeeStreamMethodsExample17 {
    public static void main(String[] args) {
        List<EmployeeClass> employees = new ArrayList<>();
        employees.add(new EmployeeClass("Alice", 30, "HR"));
        employees.add(new EmployeeClass("Bob", 25, "Engineering"));
        employees.add(new EmployeeClass("Charlie", 40, "Sales"));
        employees.add(new EmployeeClass("David", 28, "Engineering"));
        employees.add(new EmployeeClass("Eva", 35, "HR"));

        // Stream creation
        Stream<EmployeeClass> streamOfEmployees = employees.stream();

        // Filtering - Employees in the HR department
        Stream<EmployeeClass> hrEmployees = streamOfEmployees.filter(employee -> employee.getDepartment().equals("HR"));

        // Mapping - Ages of HR employees
        Stream<Integer> agesOfHREmployees = hrEmployees.map(EmployeeClass::getAge);

        // Summing ages of HR employees
        int sumOfAges = agesOfHREmployees.reduce(0, Integer::sum);
        System.out.println("Sum of Ages of HR Employees: " + sumOfAges);

        // Stream creation (again, since stream can only be consumed once)
        Stream<EmployeeClass> newStreamOfEmployees = employees.stream();

        // Collecting to a map by department
        Map<String, List<EmployeeClass>> employeesByDepartment = newStreamOfEmployees.collect(Collectors.groupingBy(EmployeeClass::getDepartment));

        System.out.println("Employees by Department:");
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println(department + ": " + employeeList);
        });

        // Stream creation (again)
        Stream<EmployeeClass> anotherStreamOfEmployees = employees.stream();

        // Finding youngest employee in Engineering department
        Optional<EmployeeClass> youngestInEngineering = anotherStreamOfEmployees
                .filter(employee -> employee.getDepartment().equals("Engineering"))
                .min(Comparator.comparingInt(EmployeeClass::getAge));

        System.out.println("Youngest in Engineering: " + youngestInEngineering.orElse(null));
    }
}
