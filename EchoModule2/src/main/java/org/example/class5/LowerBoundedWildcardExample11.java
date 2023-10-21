package org.example.class5;

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

class RegularEmployee extends Employee {
    public RegularEmployee(String name) {
        super(name);
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String name) {
        super(name);
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
}


public class LowerBoundedWildcardExample11 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        addEmployee(employees, new RegularEmployee("John Doe"));
        addEmployee(employees, new ContractEmployee("Jane Smith"));
        addEmployee(employees, new Manager("Mike Johnson"));

        printEmployees(employees);
    }

    // Lower-bounded wildcard: void addEmployee(List<? super Employee> list, Employee employee)
    public static void addEmployee(List<? super Employee> list, Employee employee) {
        list.add(employee);
    }

    public static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
        }
    }
}
