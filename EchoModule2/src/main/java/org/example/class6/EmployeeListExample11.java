package org.example.class6;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeListExample11
{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Charlie"));
        employees.add(new Employee("David"));

        // Using lambda expression to print each employee's name
        employees.forEach((employee) -> System.out.println(employee.getName()));

        // Using method reference to print each employee's name
        employees.forEach(Employee::getName);
    }
}

