package oca.chapter2.alexandra_petre.polimorphism;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("I am an animal with name: " + name);
    }
}
