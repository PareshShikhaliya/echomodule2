package org.example.class2;
/*
 all the differences between method overloading and method overriding in Java:

Method Overloading:

Definition:

Method overloading occurs when multiple methods have the same name within the same class but with different parameter
 lists (number or type of parameters).
The methods must have the same name but different method signatures.

Scope:

Method overloading is done within the same class.
Return Type:

Method overloading can have the same or different return types.
Compile-time Polymorphism:

Method overloading is an example of compile-time polymorphism (static polymorphism) as the decision of which method to call is made during compilation based on the method signature.
Invocation:

The compiler determines which version of the method to call based on the arguments provided during the method invocation.
Examples:

int add(int a, int b)
double add(double a, double b)
int add(int a, int b, int c)
Method Overriding:

Definition:

Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
The method in the subclass has the same name, return type, and method parameters as the one in the superclass.
Scope:

Method overriding is done in a subclass that extends a superclass.
Return Type:

Method overriding must have the same return type as the method in the superclass.
Run-time Polymorphism:

Method overriding is an example of run-time polymorphism (dynamic polymorphism) as the decision of which method to call is made at runtime based on the actual object type.
Invocation:

The JVM determines which version of the method to call based on the actual object type, not the reference type.
Examples:

Superclass: void makeSound() and Subclasses: void makeSound() (Dog) and void makeSound() (Cat)
 */
class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}


class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}



public class Main4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        int sum3 = calculator.add(2, 3, 5);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 3: " + sum3);


        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        genericAnimal.makeSound(); // Output: Generic animal sound
        dog.makeSound(); // Output: Woof! Woof!
        cat.makeSound(); // Output: Meow!
    }
}
