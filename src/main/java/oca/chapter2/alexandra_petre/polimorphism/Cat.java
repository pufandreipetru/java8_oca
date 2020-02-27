package oca.chapter2.alexandra_petre.polimorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void describe() {
        System.out.println("I am a cat with name " + name);
    }
}
