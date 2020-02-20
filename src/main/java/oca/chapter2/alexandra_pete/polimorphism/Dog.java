package oca.chapter2.alexandra_pete.polimorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void describe() {
        System.out.println("I am a dog with name " + name);
    }
}
