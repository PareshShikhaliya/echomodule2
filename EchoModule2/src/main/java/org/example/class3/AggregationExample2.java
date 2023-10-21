package org.example.class3;

// Address class (Part of Aggregation)
class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String toString() {
        return street + ", " + city;
    }
}

// Person class (Container with Aggregation)
class Person {
    private Address address;

    public Person(Address address)
    {
        this.address = address;
    }

    public void displayAddress() {
        System.out.println("Address: " + address);
    }
}

public class AggregationExample2 {
    public static void main(String[] args) {
        Address address = new Address("New York", "123 Main St");
        Person person = new Person(address);
        person.displayAddress();
    }
}

