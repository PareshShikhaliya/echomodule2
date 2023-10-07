package org.example.class1;

// Polymorphism example with musical instruments

// Step 1: Create an interface 'Playable'
interface Playable
{
    void play();
}

// Step 2: Create classes for different musical instruments that implement 'Playable'
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano: Playing beautiful melodies.");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar: Strumming the strings.");
    }
}

class Flute implements Playable
{
    @Override
    public void play() {
        System.out.println("Flute: Producing enchanting tunes.");
    }
}

// Step 3: Create a 'Musician' class that can play any instrument without knowing its specific type
class Musician
{
    public void playInstrument(Playable instrument)
    {
        instrument.play();
    }
}

// Main class to create and interact with musical instruments
public class Polymorphism
{
    public static void main(String[] args) {
        Musician musician = new Musician();

        // Create instances of different musical instruments
        Playable piano = new Piano();
        Playable guitar = new Guitar();
        Playable flute = new Flute();

        // Play the instruments without knowing their specific types
        musician.playInstrument(piano);
        musician.playInstrument(guitar);
        musician.playInstrument(flute);
    }
}
