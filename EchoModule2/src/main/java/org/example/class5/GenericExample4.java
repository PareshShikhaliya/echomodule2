package org.example.class5;

public class GenericExample4 {
    public static void main(String[] args) {
        // Generic Class Example
        Box<Integer> integerBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, World!");

        int intValue = integerBox.getContent();
        String stringValue = stringBox.getContent();
        System.out.println("The intvalue =="+intValue);
        System.out.println("The stringValue =="+stringValue);

    }
}

// Generic Class (Outer Class)
class Box<T>
{
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content)
    {
        this.content = content;
    }
}





