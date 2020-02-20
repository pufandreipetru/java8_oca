package oca.chapter2.alexandra_pete.polimorphism;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    public void describe() {
        System.out.println("I am a horse with name " + name);
    }
}
