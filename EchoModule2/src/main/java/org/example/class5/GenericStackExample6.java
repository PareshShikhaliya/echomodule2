package org.example.class5;

public class GenericStackExample6 {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Stack of Integers:");
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        // Creating a stack of strings
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Java");
        stringStack.push("is");
        stringStack.push("awesome");

        System.out.println("Stack of Strings:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}

// Generic Stack Class (Outer Class)
class Stack<T> {
    private Node<T> top;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Inner Node class
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
