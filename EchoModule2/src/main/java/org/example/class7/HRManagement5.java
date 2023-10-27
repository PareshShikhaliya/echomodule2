package org.example.class7;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void work()
    {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee
{
    private String department;

    Manager(String name, String department)
    {
        super(name);
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

    void conductMeeting()
    {
        System.out.println(getName() + " is conducting a meeting in the " + department + " department.");
    }
}

class Intern extends Employee {
    private String school;

    Intern(String name, String school) {
        super(name);
        this.school = school;
    }

    String getSchool() {
        return school;
    }

    void learn() {
        System.out.println(getName() + " is learning at " + school);
    }
}

public class HRManagement5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John"));
        employees.add(new Manager("Alice", "Marketing"));
        employees.add(new Intern("Bob", "University XYZ"));

        for (Employee employee : employees)
        {
            // Upcasting: Treating each employee as an Employee object
            // Even though the elements in the list are of different subclasses
            employee.work();
            // Accesses common method for all employees

            if (employee instanceof Manager manager)
            {
                // Downcasting: Converting the employee reference back to Manager type
                //Manager manager = (Manager) employee; // Casting to access Manager-specific methods
                manager.conductMeeting();
            } else if (employee instanceof Intern intern)
            {
                // Downcasting: Converting the employee reference back to Intern type
                //Intern intern = (Intern) employee; // Casting to access Intern-specific methods
                intern.learn();
            }
        }
    }
}
